package com.tionkior.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName : EnableUser
 * @Author : TionKior
 * @Date : 2021/6/21 8:45
 * @Version : V1.0
 * @Description :
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserConfig.class)
public @interface EnableUser {
}
