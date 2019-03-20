package com.exception;

/**
 * @BelongsProject: springboot_test1
 * @BelongsPackage: com.exception
 * @Author: yang
 * @CreateTime: 2019-03-19 13:52
 * @Description: ${Description}
 */

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 用于捕获全局异常
 */
@ControllerAdvice //控制器切面捕获异常
public class GlobalExceptionHandler {

    //处理异常
    @ExceptionHandler(RuntimeException.class)  //捕获运行时异常
    @ResponseBody
    public Map<String,String> excpetionHandler(){
        Map<String,String> map=new HashMap<>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误");
        return map;
    }
}
