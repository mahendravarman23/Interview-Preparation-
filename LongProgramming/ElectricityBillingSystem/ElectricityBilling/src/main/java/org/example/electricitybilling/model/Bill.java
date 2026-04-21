package org.example.electricitybilling.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;

    private String customerName;
    private int units;
    private double amount;
    private String status;

    public Bill() {}

    // getters & setters
}
