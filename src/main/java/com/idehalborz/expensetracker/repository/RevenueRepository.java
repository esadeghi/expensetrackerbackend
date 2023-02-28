package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.Revenue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevenueRepository  extends CrudRepository<Revenue, Integer> {
}
