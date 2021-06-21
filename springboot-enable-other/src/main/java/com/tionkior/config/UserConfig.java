package com.tionkior.config;

import com.tionkior.domain.Role;
import com.tionkior.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName : UserConfig
 * @Author : TionKior
 * @Date : 2021/6/21 8:44
 * @Version : V1.0
 * @Description :
 */

@Configuration
public class UserConfig {

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public Role role(){
        return new Role();
    }

}
