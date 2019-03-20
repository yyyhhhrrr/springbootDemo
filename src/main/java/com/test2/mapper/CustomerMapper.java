package com.test2.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.test2.mapper
 * @Author: yang
 * @CreateTime: 2019-03-19 15:37
 * @Description: ${Description}
 */
public interface CustomerMapper {

    @Insert("insert into customer (name,tel) values(#{name},#{tel})")
    int insert(@Param("name")String name,@Param("tel")String tel);
}
