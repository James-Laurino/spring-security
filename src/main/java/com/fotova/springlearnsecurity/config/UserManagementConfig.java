package com.fotova.springlearnsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class UserManagementConfig
{
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource)
    {
        return new JdbcUserDetailsManager(dataSource);
    }
}
