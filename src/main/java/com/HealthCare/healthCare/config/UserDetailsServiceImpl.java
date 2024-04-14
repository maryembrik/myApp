package com.HealthCare.healthCare.config;

import com.HealthCare.healthCare.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private PasswordEncoder passwordEncoder;

    @Override

    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        if ("admin".equals(username)) {
            String encodedPassword = passwordEncoder.encode("password");
            return User.builder()
                    .username(username)
                    .password(encodedPassword)
                    .roles("ADMIN")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
