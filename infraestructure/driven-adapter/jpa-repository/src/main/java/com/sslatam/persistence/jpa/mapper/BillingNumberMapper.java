package com.sslatam.persistence.jpa.mapper;

import com.sslatam.domain.model.BillingNumber;
import com.sslatam.persistence.jpa.entity.BillingNumberEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BillingNumberMapper {

    List<BillingNumber> toListModel(List<BillingNumberEntity> numbers);
}
