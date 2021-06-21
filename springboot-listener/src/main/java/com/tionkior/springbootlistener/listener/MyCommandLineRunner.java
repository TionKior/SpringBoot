package com.tionkior.springbootlistener.listener;

import org.springframework.boot.CommandLineRunner;

/**
 * @ClassName : MyCommandLineRunner
 * @Author : TionKior
 * @Date : 2021/6/21 11:13
 * @Version : V1.0
 * @Description :
 */

public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run");
    }
}
