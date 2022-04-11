package in.pavanallur.expensetrackerapi.exception;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import in.pavanallur.expensetrackerapi.entity.ErrorObject;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ExpenseNotFoundException.class)
	public ResponseEntity<ErrorObject> handleExpenseNotFoundException(ExpenseNotFoundException ex,WebRequest request){
		ErrorObject errorObject=new ErrorObject();
		errorObject.setStatuscode(HttpStatus.NOT_FOUND.value());
		errorObject.setMessage(ex.getMessage());
		errorObject.setTimestamp(new Date());
		
		return  new ResponseEntity<ErrorObject> (errorObject,HttpStatus.NOT_FOUND);
	}
}
