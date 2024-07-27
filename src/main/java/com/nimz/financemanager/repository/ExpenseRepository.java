package com.nimz.financemanager.repository;

import com.nimz.financemanager.model.Expense;
import com.nimz.financemanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUser(User user);
}
