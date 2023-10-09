package com.example.peopleexpenses.service;

import com.example.peopleexpenses.entity.Expenses;
import com.example.peopleexpenses.model.AddExpense;
import com.example.peopleexpenses.repository.ExpenseRepo;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepo expenseRepo;

    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    public Expenses addExpense(AddExpense addExpense){
        Expenses expense = new Expenses();

        expense.setId(addExpense.getId());
        expense.setAmount(addExpense.getAmount());
        expense.setPlace(addExpense.getPlace());
        expense.setWho(addExpense.getWho());

        return this.expenseRepo.save(expense);
    }
}
