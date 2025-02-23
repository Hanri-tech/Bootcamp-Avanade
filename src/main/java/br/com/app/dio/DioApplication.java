package br.com.app.dio;

import br.com.app.dio.dtos.UserDTO;
import br.com.app.dio.entities.User;
import br.com.app.dio.mappers.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DioApplication {

    public static void main(String[] args) {
        UserMapper mapper = UserMapper.mapper;
        User user = new User();
        user.setIdCode(1);
        user.setUsername("Hanri");

        UserDTO userDTO = new UserDTO();
        userDTO.setId(2);
        userDTO.setNome("Santiago");

        System.out.println("MAPEADO USERDTO PARA USER");
        System.out.println(mapper.userDTOToUser(userDTO));

        System.out.println("MAPEADO USER PARA USERDTO");
        System.out.println(mapper.userToUserDTO(user));
        SpringApplication.run(DioApplication.class, args);


    }

}
