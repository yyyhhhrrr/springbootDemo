package com.controller;

import com.model.User;
import com.mysql.jdbc.log.LogFactory;
import com.test1.service.UserService;
import com.test2.service.CustomerService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/user")
public class UserController {

   private Logger logger=Logger.getLogger(this.getClass());


    @Autowired
    private UserService userService;

    @Autowired
    private CustomerService customerService;


    @RequestMapping("/{id}")
    public User userInfo(@PathVariable("id") Integer id){
        User user=new User();
        user.setId(id);
        user.setName("yhr");
        user.setAge(23);
        int i=10/0;
        return user;
    }

    @RequestMapping("/add")
    public String add(String name){
        userService.register(name,"123");
        customerService.add(name,"110");
        return "success";
    }




    @RequestMapping("/register")
    public String register(String username,String password){
        logger.info("register 被调用了");
        //记录客户端请求参数
        //把数据保存到test1数据库
        return "success";

    }


}
