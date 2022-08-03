package com.sparta.springpostwork01.service;

import com.sparta.springpostwork01.domain.User;
import com.sparta.springpostwork01.domain.UserRoleEnum;
import com.sparta.springpostwork01.domain.SignupRequestDto;
import com.sparta.springpostwork01.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(SignupRequestDto requestDto) {
        // 회원 ID 중복 확인
        String username = requestDto.getUsername();
        Optional<User> found = userRepository.findByUsername(username);
        if (found.isPresent()) {
            throw new IllegalArgumentException("중복된 사용자 ID 가 존재합니다.");
        }

        if (!requestDto.getPasswordCheck().equals(requestDto.getPassword())) {
            throw new IllegalArgumentException("재확인 비밀번호와 일치하지 않습니다.");
        }


        // 패스워드 암호화
        String password = passwordEncoder.encode(requestDto.getPassword());


        // 사용자 ROLE 확인
        UserRoleEnum role = UserRoleEnum.USER;


        User user = new User(username, password, role);
        userRepository.save(user);
    }
}