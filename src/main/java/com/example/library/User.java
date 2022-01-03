package com.example.library;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
public class User {
    private String username;
    private String password;
}
