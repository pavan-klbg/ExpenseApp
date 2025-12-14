package in.pavanallur.expensetrackerapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String userName;
    private String userEmail;
    private String userPassword;
    private Timestamp createdAt;
    private LocalDateTime updatedAt;
}
