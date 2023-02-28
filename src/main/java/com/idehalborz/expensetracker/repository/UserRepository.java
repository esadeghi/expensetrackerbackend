package com.idehalborz.expensetracker.repository;

import com.idehalborz.expensetracker.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AppUser, Integer> {
    AppUser findByemail(String email);
}
