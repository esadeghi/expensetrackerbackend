package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.RevenueSource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueSourceRepository extends CrudRepository<RevenueSource, Integer> {
}
