package com.fotova.springlearnsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserManagementConfig
{
    @Bean
    public UserDetailsService userDetailsService()
    {
        var user1 = User.builder()
                .username("james")
                .password("{noop}1234")
                .authorities("write")
                .build();

        var user2 = User.builder()
                .username("thomas")
                .password("{noop}1234")
                .authorities("read")
                .build();

        return new InMemoryUserDetailsManager(user1,user2);

    }
}
