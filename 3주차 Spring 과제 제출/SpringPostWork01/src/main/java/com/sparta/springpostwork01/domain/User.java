package com.sparta.springpostwork01.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    @Getter(onMethod = @__( @JsonIgnore))
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
