package com.model;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.model
 * @Author: yang
 * @CreateTime: 2019-03-19 14:15
 * @Description: ${Description}
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
