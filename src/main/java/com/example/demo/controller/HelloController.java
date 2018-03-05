package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    //直接返回字符串一定要加此注解，不然会显示没有匹配的
    @ResponseBody
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/bye")
    @ResponseBody
    public String bye(){
        return "Bye SpringBoot!";
    }

}
