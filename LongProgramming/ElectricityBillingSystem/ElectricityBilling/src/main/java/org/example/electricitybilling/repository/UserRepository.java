package org.example.electricitybilling.repository;
import org.example.electricitybilling.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
