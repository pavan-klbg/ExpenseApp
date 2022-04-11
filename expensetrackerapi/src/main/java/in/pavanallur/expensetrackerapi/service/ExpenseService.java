package in.pavanallur.expensetrackerapi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.pavanallur.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	
//List<Expense>getAllExpenses();
Page<Expense>getAllExpenses(Pageable page);  // for pagination
Expense getExpenseById(Long id);
void deleteExpenseById(Long id);

Expense saveExpensDetails(Expense expense);
Expense updateExpenseDetailse(Long id, Expense expense);
}
