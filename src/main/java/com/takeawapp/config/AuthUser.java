package com.takeawapp.config;

import com.takeawapp.domain.UserEntity;
import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.io.Serial;
import java.util.Collections;

@Getter
public class AuthUser extends User {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String fullName;

    public AuthUser(UserEntity userEntity) {
        super(userEntity.getEmail(), userEntity.getPassword(), Collections.emptyList());

        this.fullName = userEntity.getName();
    }

}
