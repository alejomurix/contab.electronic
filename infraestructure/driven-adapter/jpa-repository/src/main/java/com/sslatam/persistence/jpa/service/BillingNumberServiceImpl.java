package com.sslatam.persistence.jpa.service;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.domain.model.gateway.BillingNumberService;
import com.sslatam.persistence.jpa.mapper.BillingNumberMapper;
import com.sslatam.persistence.jpa.repository.BillingNumberRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillingNumberServiceImpl implements BillingNumberService {

    private final BillingNumberRepository numberRepository;

    private final BillingNumberMapper numberMapper;

    public BillingNumberServiceImpl(
            BillingNumberRepository numberRepository,
            BillingNumberMapper numberMapper) {
        this.numberRepository = numberRepository;
        this.numberMapper = numberMapper;
    }

    @Override
    public Boolean save(BillingNumber billingNumber) {
        return null;
    }

    @Override
    public List<BillingNumber> numbers() {
        return numberMapper.toListModel(numberRepository.findAll());
    }
}
