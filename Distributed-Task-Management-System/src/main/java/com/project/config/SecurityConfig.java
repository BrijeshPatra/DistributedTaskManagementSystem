package com.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfiguration {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() // Disable CSRF protection for simplicity
                .authorizeRequests()
                .antMatchers("/api/auth/register").permitAll() // Allow registration endpoint without authentication
                .anyRequest().authenticated() // All other endpoints require authentication
                .and()
                .formLogin() // Enable form-based login
                .loginProcessingUrl("/api/auth/login") // Endpoint for login
                .usernameParameter("username") // Username parameter name
                .passwordParameter("password") // Password parameter name
                .permitAll() // Allow anyone to access login page
                .and()
                .logout() // Enable logout
                .logoutUrl("/api/auth/logout") // Endpoint for logout
                .logoutSuccessUrl("/") // Redirect to homepage after logout
                .permitAll(); // Allow anyone to logout
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Configure in-memory authentication for simplicity
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(passwordEncoder().encode("password"))
                .roles("ADMIN");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
}
