package ru.itgirl.jdbcspringexample;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:postgresql://localhost:5432/jdbc-spring-example")
                .username("postgres")
                .password("aimezMoi0106")
                .build();
    }
}
