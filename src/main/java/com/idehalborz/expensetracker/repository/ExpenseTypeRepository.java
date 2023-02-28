package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.ExpenseType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseTypeRepository  extends CrudRepository<ExpenseType, Short> {
}
