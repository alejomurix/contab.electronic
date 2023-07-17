package com.sslatam.api;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.domain.usecase.BillingNumberUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiRest {

    private final BillingNumberUseCase numberUseCase;

    public ApiRest(BillingNumberUseCase numberUseCase) {
        this.numberUseCase = numberUseCase;
    }

    @GetMapping
    public String index() {
        return "index of api, clean code...";
    }

    @GetMapping("/numbs")
    public List<BillingNumber> numbers() {
        return numberUseCase.numbers();
    }
}
