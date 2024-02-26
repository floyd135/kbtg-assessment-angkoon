package com.example.java_final_assessment.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
    Optional<Users> findByLoginAndPassword(String email, String password);
}
