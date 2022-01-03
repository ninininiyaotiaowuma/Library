package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Autowired
public class LibraryService {
    private User user;
    private UserRepository userRepository;

    public void register(String username, String password) {
        User newUser = User.builder().username(username).password(password).build();
        userRepository.save(newUser);
    }
}
