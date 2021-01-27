package com.springboot.chapter2.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Date;

public class DatabaseConditional implements Condition {
    /**
     *
     * @param context 条件，可获取运行环境
     * @param metadata 注释类型的元数据
     * @return true 为成功
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        System.out.println(new Date()+"0"+environment.containsProperty("data.driverName")+"1"+
                environment.containsProperty("data.url")+"2"+
                environment.containsProperty("data.username")+"3"+
                environment.containsProperty("data.password"));

        return environment.containsProperty("data.driverName")
                && environment.containsProperty("data.url")
                && environment.containsProperty("data.username")
                && environment.containsProperty("data.password");
    }
}


