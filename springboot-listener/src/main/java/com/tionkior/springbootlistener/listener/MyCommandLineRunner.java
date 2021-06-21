package com.tionkior.springbootlistener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName : MyCommandLineRunner
 * @Author : TionKior
 * @Date : 2021/6/21 11:13
 * @Version : V1.0
 * @Description :
 */

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run");
        System.out.println(Arrays.asList(args));
    }
}
