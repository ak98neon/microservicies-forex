package com.in28minutes.springboot.microservice.example.forex.repo;

import com.in28minutes.springboot.microservice.example.forex.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Artem Kudria
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
