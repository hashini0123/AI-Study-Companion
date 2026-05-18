package edu.icet.service.Impl;

import edu.icet.dto.UserDTO;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(UserDTO userDTO) {
        userRepository.save(userDTO);
    }

    @Override
    public boolean updateUser(String id, UserDTO userDTO) {
        userDTO.setId(String.valueOf(Long.parseLong(id)));

        return userRepository.updateUser(userDTO);
    }

    @Override
    public boolean deleteUser(String id) {
        Long userId = Long.parseLong(id);

        return userRepository.deleteById(id);
    }

    @Override
    public List<UserDTO> getAllUser() {
        return List.of();
    }
}
