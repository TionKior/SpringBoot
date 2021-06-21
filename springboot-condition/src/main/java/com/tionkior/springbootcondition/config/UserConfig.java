package com.tionkior.springbootcondition.config;

import com.tionkior.springbootcondition.condtion.ConditionOnClass;
import com.tionkior.springbootcondition.domain.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : UserConfig
 * @Author : TionKior
 * @Date : 2021/6/20 16:54
 * @Version : V1.0
 * @Description :
 */

@Configuration
public class UserConfig {

    @Bean
    // @Conditional(ClassCondition.class)
    // @ConditionOnClass("com.alibaba.fastjson.JSON")
    public User user(){
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "tionkior",havingValue = "tionkior")
    public User user2(){
        return new User();
    }
}
