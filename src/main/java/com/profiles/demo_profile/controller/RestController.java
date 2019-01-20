package com.profiles.demo_profile.controller;

import com.profiles.demo_profile.domain.CustomerResourse;
import com.profiles.demo_profile.domain.Discount;
import com.profiles.demo_profile.domain.PruchasedProduct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/v1")
@Slf4j
public class RestController {
        static List<Discount> discountList = new ArrayList<>();
        static List<PruchasedProduct> pruchasedProductsList = new ArrayList<>();
        static CustomerResourse customerResourse = new CustomerResourse();
        static PruchasedProduct pruchasedProduct;
    static{
        pruchasedProduct = new PruchasedProduct();
        pruchasedProduct.setDescription("12 month subscription to 'Horse and Hound'");
        pruchasedProduct.setFinalPrice(new BigDecimal(50));
        pruchasedProduct.setOriginalPrice(new BigDecimal(100));
        pruchasedProduct.setProductId("sku-1234567890");

        Discount discount1 = new Discount("10-percent-off",
                "PERCENT",
                "Reduce the purchase price by 10%",
                new BigDecimal(10));


        Discount discount2 = new Discount(
                "5-dollars-off",
                "AMOUNT",
                "Reduce the purchase price by $5",
                  new BigDecimal(5),"sku-1234567890");

        pruchasedProduct.setDiscountInformation(discount1);
        pruchasedProductsList.add(pruchasedProduct);

        discountList.add(discount1);
        discountList.add(discount2);

        customerResourse.setAddress("1 Main St");
        customerResourse.setName( "Test User");
        customerResourse.setUuid("qa-test-user");
        customerResourse.setEligibleDiscounts(discountList);
        customerResourse.setProducts(pruchasedProductsList);


       discountList.forEach(discount -> System.out.println(discount.getProductId()));


    }
    @GetMapping(value = "/customers/qa-test-user",produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getDockerRunning() throws JSONException {
        return customerResourse;
    };
}

