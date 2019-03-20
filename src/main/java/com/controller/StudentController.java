package com.controller;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.controller
 * @Author: yang
 * @CreateTime: 2019-03-19 14:11
 * @Description: ${Description}
 */

/**
 * @RestController:一般restcontroller 用于写api 给移动客户端提供接口数据 一般是返回json数据
 * @Controller 一般用于写界面
 */

@Controller
@RequestMapping("/stu")
public class StudentController {



    @RequestMapping("list")
    public String List(Model model){
        model.addAttribute("username","yhr");
        model.addAttribute("age",23);
        List<Student> studentList=new ArrayList<>();
        model.addAttribute(studentList);
        Student student=new Student();
        student.setId(2);
        student.setAge(23);
        student.setName("yhr");
        studentList.add(student);
        Student student1=new Student();
        student1.setId(1);
        student1.setAge(22);
        student1.setName("xxx");
        studentList.add(student1);
        model.addAttribute(studentList);

        return "stu/list"; //找模板页面
    }

}
