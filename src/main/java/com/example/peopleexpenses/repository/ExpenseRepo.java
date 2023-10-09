package com.example.peopleexpenses.repository;

import com.example.peopleexpenses.entity.Expenses;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepo extends CrudRepository<Expenses,Integer> {
}
