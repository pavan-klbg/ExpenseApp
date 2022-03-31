package in.pavanallur.expensetrackerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pavanallur.expensetrackerapi.entity.Expense;
import in.pavanallur.expensetrackerapi.service.ExpenseService;

@RestController
public class ExpenseController {
	@Autowired
	public ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<Expense> getAllExpenses() {
		return  expenseService.getAllExpenses();
	}
}
