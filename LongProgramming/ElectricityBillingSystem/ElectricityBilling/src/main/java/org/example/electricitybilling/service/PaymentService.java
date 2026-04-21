package org.example.electricitybilling.service;

import org.example.electricitybilling.model.Bill;
import org.example.electricitybilling.repository.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final BillRepository billRepository;

    public PaymentService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    // Pay bill
    public String payBill(int billId) {

        Bill bill = billRepository.findById(billId).orElse(null);

        if (bill == null) {
            return "Bill not found";
        }

        if ("PAID".equals(bill.getStatus())) {
            return "Bill already paid";
        }

        bill.setStatus("PAID");
        billRepository.save(bill); // ✅ IMPORTANT

        return "Payment Successful";
    }
}