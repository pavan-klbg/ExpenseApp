package in.pavanallur.expensetrackerapi.service;

import java.util.List;

import in.pavanallur.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	
List<Expense>getAllExpenses();

Expense getExpenseById(Long id);
void deleteExpenseById(Long id);

Expense saveExpensDetails(Expense expense);
Expense updateExpenseDetailse(Long id, Expense expense);
}
