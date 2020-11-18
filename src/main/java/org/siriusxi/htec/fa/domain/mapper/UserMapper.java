package org.siriusxi.htec.fa.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.siriusxi.htec.fa.domain.dto.UserView;
import org.siriusxi.htec.fa.domain.dto.request.CreateUserRequest;
import org.siriusxi.htec.fa.domain.model.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userUuid", ignore = true)
    @Mapping(target = "comments", ignore = true)
    User toUser(CreateUserRequest request);
    
    UserView toUserView(User user);
}