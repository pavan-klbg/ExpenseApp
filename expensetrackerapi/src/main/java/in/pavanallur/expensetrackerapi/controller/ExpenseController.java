package in.pavanallur.expensetrackerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/expenses/{id}")
	public Expense getExpenseById(@PathVariable("id") Long id) {
		return expenseService.getExpenseById(id);
	}
	
	@DeleteMapping("/expenses")
	public String  deleteExpenseById( @RequestParam("id") Long id) {  // not mandatory to include "id" if the variabale name is same
		return "delete expense obj from id" +id;
	}
}
