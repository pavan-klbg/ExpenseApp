package in.pavanallur.expensetrackerapi.entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@Column(name="expense_name")
private String name;
	
private String description;
	
	@Column(name="expense_amount")
private Double amount;
	
	
private  String category;
	
//private Date date;

@Column(name="created_at",nullable=false,updatable=false)
@CreationTimestamp
private Timestamp createdAt;

@Column(name="updated_at")
@UpdateTimestamp
private Timestamp updatedAt;


}
