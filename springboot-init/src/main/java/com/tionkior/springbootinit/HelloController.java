package com.tionkior.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController
 * @Author : TionKior
 * @Date : 2021/6/20 9:59
 * @Version : V1.0
 * @Description :
 */

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Value("${person.age}")
    private int age;

    @Value("${address[0]}")
    private int address;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/hello2")
    public String hello2() {

        System.out.println(name);
        System.out.println(name2);
        System.out.println(age);
        System.out.println(address);

        System.out.println("-------------------");

        env.getProperty("person.name");
        env.getProperty("address[0]");
        System.out.println();

        System.out.println("-------------------");
        System.out.println(person);


        return "hello Spring Boot !";
    }


    @RequestMapping("/hello")
    public String hello() {
        return "hello Spring Boot !";
    }

}
