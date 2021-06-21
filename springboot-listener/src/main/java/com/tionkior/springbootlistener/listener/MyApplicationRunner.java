package com.tionkior.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @ClassName : MyApplicationRunner
 * @Author : TionKior
 * @Date : 2021/6/21 11:15
 * @Version : V1.0
 * @Description :
 */

public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner");
    }
}
