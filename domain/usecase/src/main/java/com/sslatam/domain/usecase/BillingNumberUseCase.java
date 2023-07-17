package com.sslatam.domain.usecase;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.domain.model.gateway.BillingNumberService;

import java.util.List;

public class BillingNumberUseCase {

    private final BillingNumberService billingNumberService;

    public BillingNumberUseCase(BillingNumberService billingNumberService) {
        this.billingNumberService = billingNumberService;
    }

    public boolean save(BillingNumber billingNumber) {
        this.billingNumberService.save(billingNumber);
        return true;
    }

    public List<BillingNumber> numbers() {
        return this.billingNumberService.numbers();
    }
}
