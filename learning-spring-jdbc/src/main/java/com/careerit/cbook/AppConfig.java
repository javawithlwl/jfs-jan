package com.careerit.cbook;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource obj = new DriverManagerDataSource();
        obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
        obj.setUrl("jdbc:mysql://localhost:3306/lwl_db?allowPublicKeyRetrieval=true&useSSL=false");
        obj.setUsername("dbuser");
        obj.setPassword("dbuser");
        return obj;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        return new NamedParameterJdbcTemplate(dataSource());
    }
}
