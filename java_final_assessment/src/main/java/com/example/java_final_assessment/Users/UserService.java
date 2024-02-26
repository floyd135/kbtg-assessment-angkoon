package com.example.java_final_assessment.Users;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public Users registerUser(String email, String password, String name, boolean role) {
//        if (email != null && password != null) {
//            Users user = new Users();
//            user.setEmail(email);
//            user.setPassword(password);
//            user.setName(name);
//
//            return userRepository.save(user);
//        } else {
//            return null;
//        }
//    }

    public Users authen_login(String email, String password) {
        return userRepository.findByLoginAndPassword(email, password).orElse(null);
    }

    public Users registerUser(UserRequestDto userRequestDto) {
        if (userRequestDto.getEmail() != null && userRequestDto.getPassword() != null) {
            Users user = new Users();
            userRequestDto.setEmail(userRequestDto.getEmail());
            userRequestDto.setPassword(userRequestDto.getPassword());
            userRequestDto.setName(userRequestDto.getName());
            userRequestDto.setRole(userRequestDto.getRole());

            return userRepository.save(user);
        } else {
            return null;
        }
    }
}
