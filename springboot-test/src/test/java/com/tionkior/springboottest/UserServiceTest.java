package com.tionkior.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName : UserServiceTest
 * @Author : TionKior
 * @Date : 2021/6/20 13:37
 * @Version : V1.0
 * @Description : UserService的测试类
 */

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }

}

