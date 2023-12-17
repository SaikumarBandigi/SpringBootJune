package com.sb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void config(AuthenticationManagerBuilder authobj) throws Exception {

        authobj.inMemoryAuthentication().withUser("sonuadmin").password("{noop}sonuadmin").roles("admin");
        authobj.inMemoryAuthentication().withUser("sonuguest").password("{noop}sonuguest").roles("guest");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf().disable().
                authorizeRequests().
                antMatchers("/api/person/getPersonById/**").hasAnyRole("guest", "admin").
                antMatchers("/api/person/**").hasRole("admin").and().formLogin();
    }

}

/*
In your code, you are using inMemoryAuthentication to configure in-memory authentication with two users ("sonuadmin" and "sonuguest")
and their corresponding roles ("admin" and "guest").
 The {noop} prefix indicates that the passwords are stored in plaintext (no encoding).
 */

/*

These methods are part of the overall configuration process in Spring Security.
Spring Security automatically discovers and applies security configurations based on the classes annotated with @EnableWebSecurity.
When your application starts up, Spring Security initializes and uses the configuration provided in your SecurityConfig class.

In summary, these methods are invoked internally by the Spring Security framework as part of the security configuration setup,
and you don't need to explicitly call them yourself. The framework handles the invocation during the application startup process.

 */
