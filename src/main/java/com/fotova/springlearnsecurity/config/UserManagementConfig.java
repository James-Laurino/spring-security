package com.fotova.springlearnsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

@Configuration
public class UserManagementConfig
{
    @Bean
    public UserDetailsService userDetailsService()
    {
        var user1 = User.builder()
                .username("james")
                .password("{noop}1234")
                .authorities("WRITE")
                .build();

        var user2 = User.builder()
                .username("thomas")
                .password("{noop}1234")
                .authorities("READ")
                .build();

        UserDetails user3 = User.builder()
                .username("tito")
                .password("{noop}1234")
                .authorities("DELETE")
                .accountExpired(false)
                .disabled(true)
                .build();

        List<UserDetails> users = List.of(user1,user2,user3);

        return new InMemoryUserDetailsManager(users);

    }
}
