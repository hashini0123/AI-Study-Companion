package edu.icet.repository;

import edu.icet.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserRepository {
    void save(UserDTO userDTO);

    boolean updateUser(UserDTO userDTO);

    boolean deleteById(String id);

    List<UserDTO> getAll();
}
