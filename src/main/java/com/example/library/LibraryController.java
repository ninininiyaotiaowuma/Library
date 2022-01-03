package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Autowired
public class LibraryController {
    private LibraryService libraryService;

    @PostMapping("/register/{username}/{password}")
    public void userRegister(@PathVariable String username,
                             @PathVariable String password) {
        libraryService.register(username, password);
    }
}
