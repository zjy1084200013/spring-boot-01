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
        // 真不少
        // 真好
        System.out.println("我提交了一个数据");
        System.out.println("师姐好");
        return "hello world!";
    }
}
