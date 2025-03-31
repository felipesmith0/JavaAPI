package com.example.demo.service;


import com.example.demo.dto.UserDTO;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;





    public List<UserDTO> getAllUsers() {
        List<UserModel> users = userRepository.getAll();
        List<UserDTO> listUsersDto = convertTo(users);
        return listUsersDto;
    }

    private List<UserDTO> convertTo(List<UserModel> userModel){
       List<UserDTO> listUsersDto = new ArrayList<>();
        for (UserModel user : userModel) {
            listUsersDto.add(convertTo(user));
        }
        return listUsersDto;
    }

    public UserDTO convertTo(UserModel contasPagar){
        UserDTO dto = new UserDTO();
        dto.setId(contasPagar.getId());
        dto.setName(contasPagar.getName());
        dto.setPassword(contasPagar.getPassword());
        dto.setEmail(contasPagar.getEmail());
        return dto;
    };
}
