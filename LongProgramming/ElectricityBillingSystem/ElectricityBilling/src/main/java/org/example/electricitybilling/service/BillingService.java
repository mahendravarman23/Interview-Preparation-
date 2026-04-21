package org.example.electricitybilling.service;
import org.example.electricitybilling.model.Bill;
import org.example.electricitybilling.repository.BillRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BillingService {

    private final BillRepository billRepo;

    public BillingService(BillRepository billRepo) {
        this.billRepo = billRepo;
    }

    public Bill generateBill(String name, int units) {

        double amount;

        if (units <= 100) amount = units * 2;
        else if (units <= 200) amount = (100*2) + (units-100)*3;
        else amount = (100*2) + (100*3) + (units-200)*5;

        Bill bill = new Bill();
        bill.setCustomerName(name);
        bill.setUnits(units);
        bill.setAmount(amount);
        bill.setStatus("NOT_PAID");

        return billRepo.save(bill);
    }

    public List<Bill> getAllBills() {
        return billRepo.findAll();
    }

    public Bill getBill(int id) {
        return billRepo.findById(id).orElse(null);
    }


}
