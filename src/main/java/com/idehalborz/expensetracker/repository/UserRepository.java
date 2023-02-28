package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findByemail(String email);
}
