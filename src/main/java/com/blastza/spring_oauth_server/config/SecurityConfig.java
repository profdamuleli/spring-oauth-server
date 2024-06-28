package com.blastza.spring_oauth_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    UserDetailsService inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.builder()
                        .username("lutendo")
                        // "secret" is the password
                        .password("{bcrypt}$2a$12$MadQWW7GS3p0rbaKAngonOQILUrgfsaCzS3MS0d4E69uvE1sGx28q")
                        .roles("USER")
                        .build()
        );
    }
}
