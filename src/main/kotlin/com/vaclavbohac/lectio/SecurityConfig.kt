package com.vaclavbohac.lectio

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.provisioning.InMemoryUserDetailsManager

@Configuration
class SecurityConfig {
    @Bean
    fun authentication(): UserDetailsService {
        val john = User.builder()
            .username("johndoe")
            .password(createEncoder().encode("password"))
            .roles("USER")
            .build()

        return InMemoryUserDetailsManager(john)
    }

    private fun createEncoder() = PasswordEncoderFactories.createDelegatingPasswordEncoder()
}