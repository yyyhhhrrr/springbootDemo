package com.test1.service;

import com.test1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.test1.service
 * @Author: yang
 * @CreateTime: 2019-03-19 15:31
 * @Description: ${Description}
 */
@Service
@SuppressWarnings("all")
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public void register(String name,String password){
          userMapper.insert(name,password);
    }
}
