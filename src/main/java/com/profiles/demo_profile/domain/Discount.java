package com.profiles.demo_profile.domain;

import jdk.nashorn.internal.runtime.options.Option;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Optional;


@Setter@Getter
public class Discount {
    String discountId;
    String type;
    String description;
    BigDecimal amount;
    String productId;


    public Discount() {

    }

    public Discount(String discountId, String type, String description, BigDecimal amount) {

        this.discountId = discountId;
        this.type = type;
        this.description = description;
        this.amount = amount;
    }
    public Discount(String discountId, String type, String description, BigDecimal amount, String productId) {
        this.discountId = discountId;
        this.type = type;
        this.description = description;
        this.amount = amount;
        this.productId = productId;
    }


}
