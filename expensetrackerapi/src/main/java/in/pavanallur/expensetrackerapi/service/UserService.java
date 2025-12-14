package in.pavanallur.expensetrackerapi.service;

import in.pavanallur.expensetrackerapi.dto.UserRequest;
import in.pavanallur.expensetrackerapi.dto.UserResponse;
import in.pavanallur.expensetrackerapi.entity.User;

public interface UserService {
UserResponse saveUser(UserRequest userRequest);
}
