package com.profiles.demo_profile.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Data
public class PruchasedProduct {

    private String productId;
    private String description;
    private BigDecimal originalPrice;
    private BigDecimal finalPrice;
    private Discount discountInformation;


}
