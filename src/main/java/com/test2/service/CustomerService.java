package com.test2.service;

import com.test2.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.test2.service
 * @Author: yang
 * @CreateTime: 2019-03-19 15:39
 * @Description: ${Description}
 */

@Service
@SuppressWarnings("all")
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public void add(String name, String tel){
        customerMapper.insert(name,tel);
    }
}
