package it.com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@RestController        //标明这是一个 SpringMVC 的 Controller 控制器.
@SpringBootApplication //Spring Boot 项目的核心注解,主要目的是开启自动配置.说明这是一个 SpringBoot 应用.
@Configuration         //这是一个配置 Spring 的配置类.
public class App {
   
    @RequestMapping("hello")
    public String hello(){
        return "This is App in 8082";
    }
   
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
