package com.maicoding.rest.webservices.restfulwebservices.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/*
@Configuration
public class BasicAuthenticationSecurityConfiguration {
    //필터체인
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return
            http.authorizeHttpRequests(
                    auth ->
                        auth
                        .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()     //preflight request
                        .anyRequest().authenticated()
                )
            .httpBasic(Customizer.withDefaults())  //basic auth - 로그인창
            .sessionManagement(                     //stateless session 만들기 (CSRF 비활성화 연관)
                    session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
            .csrf().disable()
            .build();
    }
}
*/
