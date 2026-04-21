package org.example.electricitybilling.controller;



import org.example.electricitybilling.model.Bill;
import org.example.electricitybilling.service.BillingService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    // Generate bill
    @PostMapping("/generate")
    public Bill generate(@RequestParam String name, @RequestParam int units) {
        return billingService.generateBill(name, units);
    }

    // View all bills
    @GetMapping("/all")
    public List<Bill> getBills() {
        return billingService.getAllBills();
    }
}
