package com.zay.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zay.po.Student;
import com.zay.po.Teacher;
import com.zay.service.StudentService;
import com.zay.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class StudentHandler {

    @Autowired
    private StudentService studentService;

     @Autowired
    private TeacherService teacherService;

     @GetMapping("/hello")
     public String f(){
         return "hello";
     }
    @GetMapping("/findAll")
    public String findAll(Model model,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Student> students = studentService.findAll();
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        model.addAttribute("list",students);
        return "index";
    }

    @GetMapping("/toAddStudent")
    public String toAdd(Model model){
        List<Teacher> teachers = teacherService.selectAll();
        model.addAttribute("teachers",teachers);
        return "addStudent";
    }


    @PostMapping("/addStudent")
    public String addStudent(Student student){
        studentService.addStudent(student);
        return "redirect:/findAll";
    }

    @GetMapping("del/{s_id}")
    public String delStudent(@PathVariable Integer s_id){
        studentService.delStudent(s_id);
        return "redirect:/findAll";
    }

    @GetMapping("/toUpt/{s_id}")
    public String toUpt(@PathVariable Integer s_id,Model model){
        Student student = studentService.findById(s_id);
        model.addAttribute("student",student);
        List<Teacher> teachers = teacherService.selectAll();
        model.addAttribute("teachers",teachers);

        return "uptStudent";
    }

    @RequestMapping("/uptStudent")
    public String uptStudent(Student student){
        studentService.uptStudent(student);
        return "redirect:/findAll";
    }


}
