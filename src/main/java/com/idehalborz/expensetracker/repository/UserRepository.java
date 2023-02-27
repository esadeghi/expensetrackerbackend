package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findbyemail(String email);
}
