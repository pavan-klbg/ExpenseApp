package in.pavanallur.expensetrackerapi.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ErrorObject {
private Integer statuscode;
private String message;
private Date timestamp;
}
