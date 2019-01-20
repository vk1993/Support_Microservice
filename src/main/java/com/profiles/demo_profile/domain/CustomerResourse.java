package com.profiles.demo_profile.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Setter
@Getter
public class CustomerResourse {
    String uuid;
    String name;
    String address;
    List<Discount> eligibleDiscounts;
    List<PruchasedProduct> products;
}
