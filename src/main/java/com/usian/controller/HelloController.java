package com.usian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zjy
 * @create 2020-10-29 14:39
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }
}
