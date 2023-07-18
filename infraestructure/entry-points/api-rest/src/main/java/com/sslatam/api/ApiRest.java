package com.sslatam.api;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.domain.usecase.BillingNumberUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/numbering")
    public ResponseEntity<BillingNumber> create(@RequestBody BillingNumber billingNumber) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(numberUseCase.save(billingNumber));
    }
}
