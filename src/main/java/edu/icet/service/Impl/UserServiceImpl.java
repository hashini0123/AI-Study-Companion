package edu.icet.service.Impl;

import edu.icet.dto.UsersDTO;
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
    public void saveUser(UsersDTO usersDTO) {
        userRepository.save(usersDTO);
    }

    @Override
    public boolean updateUser(UsersDTO usersDTO) {
        //usersDTO.setId(String.valueOf(Long.parseLong(id)));

        return userRepository.updateUser(usersDTO);
    }

    @Override
    public boolean deleteUser(String id) {
        Long userId = Long.parseLong(id);

        return userRepository.deleteById(id);
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
