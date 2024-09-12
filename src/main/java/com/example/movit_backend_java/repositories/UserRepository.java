package com.example.movit_backend_java.repositories;

import com.example.movit_backend_java.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
