package in.pavanallur.expensetrackerapi.controller;

import in.pavanallur.expensetrackerapi.dto.ApiResponse;
import in.pavanallur.expensetrackerapi.dto.LoginRequest;
import in.pavanallur.expensetrackerapi.dto.UserRequest;
import in.pavanallur.expensetrackerapi.dto.UserResponse;
import in.pavanallur.expensetrackerapi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/api/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @Autowired
    UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl=userServiceImpl;
    }
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@RequestBody UserRequest userRequest){
    UserResponse resp=userServiceImpl.saveUser(userRequest);
ApiResponse<UserResponse> api=new ApiResponse<>(201,resp,null);
return ResponseEntity.status(HttpStatus.CREATED).body(api);
    }

    /*
    @GetMapping
    public ResponseEntity<ApiResponse<UserDto>> getUserById(@PathVariable Long userId){
        return null;
    }*/

    @PostMapping("/login")
    public String userLogin(@RequestBody LoginRequest request){
       return userServiceImpl.userLogin(request);
    }

    @GetMapping("/live")
    public String live(){
        return "application running";
    }
}
