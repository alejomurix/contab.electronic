package com.sslatam.domain.model.gateway;

import com.sslatam.domain.model.BillingNumber;

import java.util.List;

public interface BillingNumberService {

    Boolean save(BillingNumber billingNumber);
    List<BillingNumber> numbers();
}
