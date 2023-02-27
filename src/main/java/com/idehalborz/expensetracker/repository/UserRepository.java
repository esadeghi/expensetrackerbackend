package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findbyemail(String email);
}
