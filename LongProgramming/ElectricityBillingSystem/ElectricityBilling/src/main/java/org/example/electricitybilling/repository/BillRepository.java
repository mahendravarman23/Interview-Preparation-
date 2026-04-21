package org.example.electricitybilling.repository;
import org.example.electricitybilling.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BillRepository extends JpaRepository<Bill, Integer> {
}