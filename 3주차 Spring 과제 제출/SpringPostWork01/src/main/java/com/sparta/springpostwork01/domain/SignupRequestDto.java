package com.sparta.springpostwork01.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
public class SignupRequestDto {

//    @NotBlank(message="아이디를 입력하세요")
//    @Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,12}$",message = "최소 4자 이상, 12자 이하 알파벳 대소문자(a~z, A~Z), 숫자(0~9) 필요합니다")
    private String username;

//    @NotBlank(message="비밀번호를 입력하세요")
//    @Pattern(regexp="^(?=.*\\d)(?=.*[a-z]).{4,32}$",message = "최소 4자 이상이며, 32자 이하 알파벳 소문자(a~z), 숫자(0~9) 필요합니다")
    private String password;

    private String passwordCheck;

}