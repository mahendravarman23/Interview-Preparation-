package org.example.electricitybilling.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String email;

    public User() {}

    // getters & setters
}
