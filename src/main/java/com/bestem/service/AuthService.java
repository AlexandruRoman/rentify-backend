package com.bestem.service;

import com.bestem.exception.AppException;
import com.bestem.model.RoleName;
import com.bestem.model.Role;
import com.bestem.model.User;
import com.bestem.repository.RoleRepository;
import com.bestem.repository.UserRepository;
import com.bestem.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenProvider tokenProvider;

    public String signin(User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = tokenProvider.generateToken(authentication);
        return jwt;
    }

    public String signup(User signUpRequest, RoleName roleName){
        Role userRole = roleRepository.findByName(roleName)
                .orElseThrow(() -> new AppException("User Role not set."));

        User user = new User(signUpRequest.getUsername(), userRole,
                signUpRequest.getEmail(), signUpRequest.getPassword());
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);
        return "welcome!";
    }
}
