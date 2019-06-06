package com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion.controller;

import com.in28minutes.springboot.microservice.example.currencyconversion.springbootmicroservicecurrencyconversion.entity.CurrencyConversionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Artem Kudria
 */
@FeignClient(name = "forex-service")
@RibbonClient(name = "forex-service")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
