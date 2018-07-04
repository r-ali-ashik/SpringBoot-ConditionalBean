package com.aliashik.config;

import com.aliashik.dataSource.DataSource;
import com.aliashik.dataSource.DevDatabaseUtil;
import com.aliashik.dataSource.ProductionDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDataSourceConfig {
    @Bean(name="dataSource")
    @Conditional(value=DevDataSourceCondition.class)
    public DataSource getDevDataSource() {
        return new DevDatabaseUtil();
    }

    @Bean(name="dataSource")
    @Conditional(ProdDataSourceCondition.class)
    public DataSource getProdDataSource() {
        return new ProductionDatabaseUtil();
    }
}