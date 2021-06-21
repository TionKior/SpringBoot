package com.tionkior.springbootlistener.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName : MyApplicationContextInitializer
 * @Author : TionKior
 * @Date : 2021/6/21 10:46
 * @Version : V1.0
 * @Description :
 */

public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("ApplicationContextInitializer...initialize");
    }
}
