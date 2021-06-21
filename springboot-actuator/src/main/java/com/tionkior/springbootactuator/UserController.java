package com.tionkior.springbootactuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : UserController
 * @Author : TionKior
 * @Date : 2021/6/21 12:49
 * @Version : V1.0
 * @Description :
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/findAll")
    public String findAll(){
        return "success";
    }

}
