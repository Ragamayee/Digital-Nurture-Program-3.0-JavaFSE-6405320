package com.cognizant.orm_learn.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cognizant.orm_learn.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

    List<Stock> findByCodeAndDateBetween(String code, Date start, Date end);

    List<Stock> findByCodeAndCloseGreaterThan(String code, BigDecimal price);

    List<Stock> findTop3ByOrderByVolumeDesc();

    List<Stock> findTop3ByCodeOrderByCloseAsc(String code);
}
