package in.pavanallur.expensetrackerapi.controller;

import java.util.List;



import in.pavanallur.expensetrackerapi.entity.Expense;
import in.pavanallur.expensetrackerapi.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExpenseController {
	@Autowired
	public ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<Expense> getAllExpenses(Pageable page) {
		return  expenseService.getAllExpenses(page).toList();
	}
//	public List<Expense> getAllExpenses() {
//		return  expenseService.getAllExpenses();
//	}
	
	@GetMapping("/expenses/{id}")
	public Expense getExpenseById(@PathVariable("id") Long id) {
		return expenseService.getExpenseById(id);
	}
	
	@ResponseStatus(value= HttpStatus.NO_CONTENT)
	@DeleteMapping("/expenses")
	public void  deleteExpenseById( @RequestParam("id") Long id) {  // not mandatory to include "id" if the variabale name is same
		expenseService.deleteExpenseById(id);
	}
	
	@ResponseStatus(value=HttpStatus.CREATED)
	@PostMapping("/expenses")
	public Expense saveExpenseDetails(@RequestBody Expense expense) {
		return expenseService.saveExpensDetails(expense);
	}
	
	@PutMapping("/expenses/{id}")
	public Expense updateExpenseDetails(@RequestBody Expense expense,@PathVariable Long id) {
		return expenseService.updateExpenseDetailse(id, expense);
		
	}
	
}
