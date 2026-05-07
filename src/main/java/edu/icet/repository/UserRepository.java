package edu.icet.repository;

import edu.icet.dto.UserDTO;

public interface UserRepository {
    void save(UserDTO userDTO);
}
