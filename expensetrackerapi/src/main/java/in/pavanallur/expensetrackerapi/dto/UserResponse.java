package in.pavanallur.expensetrackerapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long userId;
    private String userEmail;
    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    private Timestamp createdAt;
}
