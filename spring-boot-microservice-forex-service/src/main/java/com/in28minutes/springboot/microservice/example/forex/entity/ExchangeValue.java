package com.in28minutes.springboot.microservice.example.forex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Artem Kudria
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal conversionMultiple;
    private int port;

    public ExchangeValue(String from, String to, BigDecimal conversionMultiple, int port) {
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.port = port;
    }
}
