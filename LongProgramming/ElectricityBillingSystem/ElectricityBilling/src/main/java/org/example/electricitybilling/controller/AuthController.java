package org.example.electricitybilling.controller;


import org.example.electricitybilling.model.User;
import org.example.electricitybilling.service.UserService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.login(user.getUsername(), user.getPassword());
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
