package com.example.demo.domain.repository;

import com.example.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM User AS u WHERE u.role=?1")
    List<User> selectByRole(String role);
}
