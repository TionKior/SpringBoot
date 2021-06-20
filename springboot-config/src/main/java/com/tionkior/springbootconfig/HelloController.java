package com.tionkior.springbootconfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Author : TionKior
 * @Date : 2021/6/20 12:28
 * @Version : V1.0
 * @Description :
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello config";
    }

}
