package com.example.PostgreSQL.User;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PostgreSQL.User.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

