package edu.icet.repository.Impl;

import edu.icet.dto.UserDTO;
import edu.icet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void save(UserDTO userDTO) {
        String sql = "INSERT INTO user VALUE(?,?,?,?)";
        jdbcTemplate.update(sql,
                userDTO.getId(),
                userDTO.getUserName(),
                userDTO.getEmail(),
                userDTO.getCreatedAt()
                );
    }

    @Override
    public boolean updateUser(UserDTO userDTO) {
        String sql = "UPDATE user SET userName=?, userEmail=?, CreatedAt=?, WHERE userId=?";
        return jdbcTemplate.update(sql,
                userDTO.getUserName(),
                userDTO.getEmail(),
                userDTO.getCreatedAt(),
                userDTO.getId()
                )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM user WHERE id=? ";

        return jdbcTemplate.update(sql,id)>0;
    }
}
