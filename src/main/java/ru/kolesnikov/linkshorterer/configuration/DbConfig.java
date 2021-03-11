package ru.kolesnikov.linkshorterer.configuration;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@Slf4j
public class DbConfig {

    @Bean
    public JdbcTemplate getXxiJdbcTemplate(DataSource source) {
        return new JdbcTemplate(source);
    }

    @Bean
    public SimpleJdbcCall getXxiSimpleJdbcCall(JdbcTemplate template) {
        return new SimpleJdbcCall(template);
    }
}



