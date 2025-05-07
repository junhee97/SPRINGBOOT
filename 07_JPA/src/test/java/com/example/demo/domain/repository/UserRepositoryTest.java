package com.example.demo.domain.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void t1() throws Exception {

//        //INSERT
//        User user = User.builder().username("user1").password("1234").role("ROLE_USER").build();
//        //userRepository.save(user);
//
//        //UPDATE
//        user.setPassword("4321");
//        user.setRole("ROLE_MANAGER");
//        userRepository.save(user);

        //DELETE
        userRepository.deleteById("user1");
    }

    @Test
    public void t2() throws Exception {
        
    }

}