package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Artem Kudria
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CurrencyConversionBean(String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
                                  BigDecimal totalCalculatedAmount, int port) {
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }
}
