package com.fotova.springlearnsecurity.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
//
//public class UserDummy implements UserDetails
//{
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities()
//    {
//        return List.of(new SimpleGrantedAuthority("READ"));
//    }
//
//    @Override
//    public String getPassword() {
//        return "{noop}1234";
//    }
//
//    @Override
//    public String getUsername() {
//        return "james";
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//}