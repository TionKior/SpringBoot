package com.tionkior.springbootdeploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : UserController
 * @Author : TionKior
 * @Date : 2021/6/21 13:50
 * @Version : V1.0
 * @Description :
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/findAll")
    public String findAll(){
        return "success";
    }

}
