package com.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.controller
 * @Author: yang
 * @CreateTime: 2019-03-19 13:06
 * @Description: ${Description}
 */

@RestController //声明rest风格的控制器
//@EnableAutoConfiguration //相当于写了spring配置文件
public class HelloController {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){
        return "hello springboot"+name;
    }

//    public static void main(String[] args) {
//        SpringApplication.run(HelloController.class);
//    }
}
