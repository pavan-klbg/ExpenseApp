package in.pavanallur.expensetrackerapi.mapper;


import in.pavanallur.expensetrackerapi.dto.UserDto;
import in.pavanallur.expensetrackerapi.dto.UserRequest;
import in.pavanallur.expensetrackerapi.dto.UserResponse;
import in.pavanallur.expensetrackerapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);

    UserRequest toUserRequest(User user);
    User toUserEntity(UserRequest userRequest);
    UserDto toDto(User user);
    UserResponse toUserResponse(User user);

}
