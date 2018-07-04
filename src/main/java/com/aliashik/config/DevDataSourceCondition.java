package com.aliashik.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevDataSourceCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String dbname = context.getEnvironment().getProperty("database.name");
        return dbname!= null && dbname.equalsIgnoreCase("dev");
    }

}