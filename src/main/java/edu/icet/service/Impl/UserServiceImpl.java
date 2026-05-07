package edu.icet.service.Impl;

import edu.icet.dto.UsersDTO;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    //private final UserRepository userRepository;

    @Override
    public void saveUsers(UsersDTO usersDTO) {
    }

    @Override
    public boolean updateUsers(String id, UsersDTO usersDTO) {
        return false;
    }

    @Override
    public boolean deleteUsers(String id) {
        return false;
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        return List.of();
    }
}
