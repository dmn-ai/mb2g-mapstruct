package dmn.coding.bmartin.mappers;

import dmn.coding.bmartin.domain.User;
import dmn.coding.bmartin.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);

}
