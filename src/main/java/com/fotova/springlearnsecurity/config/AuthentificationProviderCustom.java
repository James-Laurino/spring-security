package com.fotova.springlearnsecurity.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class AuthentificationProviderCustom implements AuthenticationProvider
{
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException
    {
        String username = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());

        if("james".equals(username) && "1234".equals(password))
        {
            log.info(username);
            log.info(password);
            return new UsernamePasswordAuthenticationToken(username,password, Arrays.asList());
        }
        else
        {
            throw new AuthenticationCredentialsNotFoundException("Error");
        }

    }

    @Override
    public boolean supports(Class<?> authenticationType)
    {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authenticationType);
    }
}
