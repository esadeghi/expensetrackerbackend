package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository  extends CrudRepository<Expense, Long> {
}
