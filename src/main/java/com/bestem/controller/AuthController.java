package com.bestem.controller;

import com.bestem.model.RoleName;
import com.bestem.model.User;
import com.bestem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/signin")
    public String userSignin(@RequestBody User user) {
        return authService.signin(user);
    }

    @PostMapping("/user/signup")
    public String userSignup(@RequestBody final User signUpRequest){
        return authService.signup(signUpRequest, RoleName.ROLE_USER);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/staff/signup")
    public String staffSignup(@RequestBody final User signUpRequest){
        return authService.signup(signUpRequest, RoleName.ROLE_STAFF);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/admin/signup")
    public String adminSignup(@RequestBody final User signUpRequest){
        return authService.signup(signUpRequest, RoleName.ROLE_ADMIN);
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user/check")
    public void checkIsUser(){ }

    @PreAuthorize("hasRole('STAFF')")
    @GetMapping("/staff/check")
    public void checkIsStaff(){ }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin/check")
    public void checkIsAdmin(){ }
}
