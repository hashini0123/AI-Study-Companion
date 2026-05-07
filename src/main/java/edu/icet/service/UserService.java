package edu.icet.service;

import edu.icet.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    boolean updateUser(String id, UserDTO userDTO);

    boolean deleteUser(String id);

    List<UserDTO> getAllUser();
}
