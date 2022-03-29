package in.pavanallur.expensetrackerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {
	
	@GetMapping("/expenses")
	public String getAllExpenses() {
		return "list of all expenses";
	}
}
