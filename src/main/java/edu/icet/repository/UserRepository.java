package edu.icet.repository;

import edu.icet.dto.UsersDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
    void save(UsersDTO usersDTO);

    boolean updateUser(UsersDTO usersDTO);

    boolean deleteById(String id);

    List<UsersDTO> getAllUsers();
}
