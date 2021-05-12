package com.zay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //路径/和/home不需要访问控制
        http
                .authorizeRequests()
                // 如果有允许匿名的url，填在下面，/和/home 放行
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                //自定义登录页面login.html
                .formLogin()
                .loginPage("/login").permitAll()

                .and()
                .logout().permitAll();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // TODO Auto-generated method stub
        //inMemoryAuthentication 从内存中获取 //auth.inMemoryAuthentication().withUser("JACK").password("123").roles("ADMIN");
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("JACK").
                password(new BCryptPasswordEncoder().encode("123")).roles("USER");

    }
}
