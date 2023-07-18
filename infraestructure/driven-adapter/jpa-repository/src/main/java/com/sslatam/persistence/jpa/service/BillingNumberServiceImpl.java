package com.sslatam.persistence.jpa.service;

import com.sslatam.domain.exception.ValidatorException;
import com.sslatam.domain.model.BillingNumber;
import com.sslatam.domain.model.gateway.BillingNumberService;
import com.sslatam.persistence.jpa.mapper.BillingNumberMapper;
import com.sslatam.persistence.jpa.repository.BillingNumberRepository;
import jakarta.validation.ConstraintViolationException;
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
    public BillingNumber save(BillingNumber billingNumber) {
        try {
            return numberMapper.toModel(
                    numberRepository.save(
                            numberMapper.toEntity(billingNumber)));
        } catch (ConstraintViolationException ex) {
            throw new ValidatorException();
        }
    }

    @Override
    public List<BillingNumber> numbers() {
        return numberMapper.toListModel(numberRepository.findAll());
    }
}
