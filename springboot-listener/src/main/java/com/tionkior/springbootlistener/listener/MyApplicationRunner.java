package com.tionkior.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName : MyApplicationRunner
 * @Author : TionKior
 * @Date : 2021/6/21 11:15
 * @Version : V1.0
 * @Description :
 */

/**
 * 当项目启动后执行run方法
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner...run");
        System.out.println(Arrays.asList(args.getSourceArgs()));
    }
}
