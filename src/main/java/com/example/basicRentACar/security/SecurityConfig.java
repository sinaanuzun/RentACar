package com.example.basicRentACar.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {


    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }


    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(HttpMethod.GET, "/api/car").hasRole("USER")
                                .requestMatchers(HttpMethod.GET, "/api/car/**").hasRole("USER")
                                .requestMatchers(HttpMethod.POST, "/api/car").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.PUT, "/api/car/**").hasRole("MANAGER")
                                .requestMatchers(HttpMethod.DELETE, "/api/car/**").hasRole("ADMIN")
                                .anyRequest().authenticated()
                )
                .formLogin(withDefaults());

        http.httpBasic();

        http.csrf().disable();


        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                .username("user")
                .password("{noop}user")
                .roles("USER")
                .build();

        UserDetails manager = User.builder()
                .username("manager")
                .password("{noop}manager")
                .roles("USER", "MANAGER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password("{noop}admin")
                .roles("USER", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user,manager,admin);
    }


}
