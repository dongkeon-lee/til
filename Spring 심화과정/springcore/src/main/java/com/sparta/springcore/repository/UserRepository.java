package com.sparta.springcore.repository;

import com.sparta.springcore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    // findByUsername 함수를 쓰기위해 만들어둔것. Jpa에는 이런 함수는 없다. 그러니 내가 만들어야지
}