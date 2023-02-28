package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
}
