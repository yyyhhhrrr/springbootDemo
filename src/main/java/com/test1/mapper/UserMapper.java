package com.test1.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.test1.mapper
 * @Author: yang
 * @CreateTime: 2019-03-19 15:32
 * @Description: ${Description}
 */
public interface UserMapper {

    @Insert("insert into user (name,password) values(#{name},#{password})")
    int insert(@Param("name") String username,@Param("password") String password);
}
