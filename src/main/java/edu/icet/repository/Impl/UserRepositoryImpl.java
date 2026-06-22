package edu.icet.repository.Impl;

import edu.icet.dto.UsersDTO;
import edu.icet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void save(UsersDTO usersDTO) {
        String sql = "INSERT INTO users (user_name,email,created_at) VALUE(?,?,?,?)";
        jdbcTemplate.update(sql,
                usersDTO.getUserName(),
                usersDTO.getEmail(),
                usersDTO.getCreated_at()
                );
    }

    @Override
    public boolean updateUser(UsersDTO usersDTO) {
        String sql = "UPDATE users SET userName=?, email=?, Created_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                usersDTO.getUserName(),
                usersDTO.getEmail(),
                usersDTO.getCreated_at(),
                usersDTO.getUser_id()
                )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM users WHERE id=? ";

        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        String sql = "SELECT * FROM users";

        List<UsersDTO> usersDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {

            UsersDTO usersDTO = new UsersDTO();

            usersDTO.setUser_id(rs.getString(1));
            usersDTO.setUserName(rs.getString(2));
            usersDTO.setEmail(rs.getString(3));
            usersDTO.setCreated_at(rs.getTimestamp(4).toLocalDateTime());
            return usersDTO;
        });
        return usersDTOList;
    }
}
