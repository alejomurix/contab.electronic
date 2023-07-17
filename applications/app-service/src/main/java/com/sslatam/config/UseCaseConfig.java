package com.sslatam.config;

import com.sslatam.domain.model.gateway.BillingNumberService;
import com.sslatam.domain.usecase.BillingNumberUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public BillingNumberUseCase billingNumberUseCase(BillingNumberService billingNumberService) {
        return new BillingNumberUseCase(billingNumberService);
    }
}
