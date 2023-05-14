package com.example.ejemploweb.service;

import com.example.ejemploweb.DTO.UserDTO;
import com.example.ejemploweb.entity.User;


public interface UserService {
     User createUser(UserDTO userDTO) throws Exception;

    User getOneUser(Long id) throws Exception;

    User updateOneUser(Long id,UserDTO userDTO) throws Exception;

}
