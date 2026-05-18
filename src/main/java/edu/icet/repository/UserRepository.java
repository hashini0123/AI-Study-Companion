package edu.icet.repository;

import edu.icet.dto.UserDTO;
import org.apache.catalina.User;

public interface UserRepository {
    void save(UserDTO userDTO);

    boolean updateUser(UserDTO userDTO);

    boolean deleteById(String id);
}
