package in.pavanallur.expensetrackerapi.service;

import java.util.List;

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

}
