package in.pavanallur.expensetrackerapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pavanallur.expensetrackerapi.entity.Expense;
import in.pavanallur.expensetrackerapi.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	@Autowired
	public ExpenseRepository expenseRepo;

	@Override
	public List<Expense> getAllExpenses() {
		return  expenseRepo.findAll();
	}

	@Override
	public Expense getExpenseById(Long id) {
		Optional<Expense> expense=expenseRepo.findById(id);
		if(expense.isPresent()) {
			return expense.get();
		}
		throw new RuntimeException(" expense not found in db for id "+id);
	}

	@Override
	public void deleteExpenseById(Long id) {
		expenseRepo.deleteById(id);
		
	}

	@Override
	public Expense saveExpensDetails(Expense expense) {
		return expenseRepo.save(expense);
	}

}
