package in.pavanallur.expensetrackerapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    @CreationTimestamp
    private Timestamp createdAt;
    @JsonIgnore
    private LocalDateTime updatedAt;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Expense> expenseList;
}
