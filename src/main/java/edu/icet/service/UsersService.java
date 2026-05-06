package edu.icet.service;

import edu.icet.dto.UsersDTO;

import java.util.List;

public interface UsersService {
    void saveUsers(UsersDTO usersDTO);

    boolean updateUsers(String id, UsersDTO usersDTO);

    boolean deleteUsers(String id);

    List<UsersDTO> getAllUsers();
}
