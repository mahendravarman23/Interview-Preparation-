package org.example.electricitybilling.service;
import org.example.electricitybilling.model.User;
import org.example.electricitybilling.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String register(User user) {
        userRepo.save(user);
        return "User Registered";
    }

    public String login(String username, String password) {
        User user = userRepo.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return "Login Successful";
        }
        return "Invalid Credentials";
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }
}