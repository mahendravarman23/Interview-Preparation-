package org.example.electricitybilling.controller;

import org.example.electricitybilling.service.PaymentService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // Pay bill
    @PostMapping("/pay")
    public String pay(@RequestParam int billId) {
        return paymentService.payBill(billId);
    }
}
