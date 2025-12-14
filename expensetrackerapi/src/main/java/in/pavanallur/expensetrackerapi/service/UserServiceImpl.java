package in.pavanallur.expensetrackerapi.service;

import in.pavanallur.expensetrackerapi.dto.UserRequest;
import in.pavanallur.expensetrackerapi.dto.UserResponse;
import in.pavanallur.expensetrackerapi.entity.User;
import in.pavanallur.expensetrackerapi.mapper.UserMapper;
import in.pavanallur.expensetrackerapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;
    @Autowired
UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserResponse saveUser(UserRequest userRequest) {
        User user=mapper.toUserEntity(userRequest);
        String hashedPwd= passwordEncoder.encode(user.getUserPassword());
        user.setUserPassword(hashedPwd);
        User savedUser=userRepository.save(user);
        return mapper.toUserResponse(savedUser);
    }
}
