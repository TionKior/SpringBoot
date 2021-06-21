package com.tionkior.springbootlistener.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName : MyApplicationContextInitializer
 * @Author : TionKior
 * @Date : 2021/6/21 10:46
 * @Version : V1.0
 * @Description :
 */

@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("ApplicationContextInitializer...initialize");
    }
}
