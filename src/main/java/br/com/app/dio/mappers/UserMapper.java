package br.com.app.dio.mappers;

import br.com.app.dio.dtos.UserDTO;
import br.com.app.dio.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper mapper = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", source = "idCode")
    @Mapping(target = "nome", source = "username")
    UserDTO userToUserDTO(User user);

    @Mapping(target = "idCode", source = "id")
    @Mapping(target = "username", source = "nome")
    User userDTOToUser(UserDTO userDTO);


}
