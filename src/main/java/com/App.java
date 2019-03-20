package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com
 * @Author: yang
 * @CreateTime: 2019-03-19 13:18
 * @Description: ${Description}
 */

//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages="com.*")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
