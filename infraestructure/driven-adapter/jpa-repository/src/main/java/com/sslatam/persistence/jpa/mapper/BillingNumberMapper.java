package com.sslatam.persistence.jpa.mapper;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.persistence.jpa.entity.BillingNumberEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillingNumberMapper {

    BillingNumber toModel(BillingNumberEntity billingNumberEntity);

    @InheritInverseConfiguration
    BillingNumberEntity toEntity(BillingNumber billingNumber);

    List<BillingNumber> toListModel(List<BillingNumberEntity> numbers);
}
