package com.tionkior.springbootcondition.condtion;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @ClassName : ClassCondition
 * @Author : TionKior
 * @Date : 2021/6/20 16:58
 * @Version : V1.0
 * @Description :
 */

public class ClassCondition implements Condition {
    /**
     *
     * @param conditionContext 上下文对象,用于获取环境,IOC容器,ClassLoader对象
     * @param annotatedTypeMetadata 注解元对象 可以用于获取注解定义的属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        /*// 1.需求：导入Jedis坐标后创建Bean
        // 思路：判断redis.clients.jedis.Jedis.class文件是否存在
        boolean flag = true;
        try {
            Class<?> cls = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return true;*/


        // 1.需求：导入通过注解指定值指定坐标后创建Bean

        // 获取注解属性值 value
        Map<String, Object> map = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        // System.out.println(map);
        String[] value = (String[]) map.get("value");

        boolean flag = true;
        try {
            for (String className : value) {
            Class<?> cls = Class.forName(className);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            flag = false;
        }
        return true;
    }
}
