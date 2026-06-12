package edu.icet.service;

import edu.icet.dto.UsersDTO;
import edu.icet.dto.UsersDTO;

import java.util.List;

public interface UserService {
    void saveUser(UsersDTO userDTO);

    boolean updateUser(UsersDTO usersDTO);

    boolean deleteUser(String id);

    List<UsersDTO> getAllUsers();
}
