package com.example.java_final_assessment.Users;

//
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String toRegister( ) {

        return "Registration Resource";
    }

    @GetMapping("/login")
    public String toLogin( ) {

        return "Login Resource";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRequestDto userRequestDto) {
        Users registeredUser = userService.registerUser(userRequestDto);
        if (registeredUser == null) return "Registration Failed";
        else return "Successfully Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserRequestDto userRequestDto) {
        Users authen_user = userService.authen_login(userRequestDto.getEmail(), userRequestDto.getPassword());

        if (authen_user.getRole() == true) {
//            authen_user.roles("ADMIN");
            System.out.println("ADMIN is present");
        }

        if (authen_user == null) return "Login Failed";
        else return "Successfully Login";
    }

}
