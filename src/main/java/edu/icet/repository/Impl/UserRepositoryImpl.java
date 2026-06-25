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
        String sql = "INSERT INTO users (id, username, email, password, role, created_at) VALUE(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                usersDTO.getId(),
                usersDTO.getUsername(),
                usersDTO.getEmail(),
                usersDTO.getPassword(),
                usersDTO.getRole(),
                usersDTO.getCreated_at()
                );
    }

    @Override
    public boolean updateUser(UsersDTO usersDTO) {
        String sql = "UPDATE users SET username=?, email=?, password=?, role=?, Created_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                usersDTO.getUsername(),
                usersDTO.getEmail(),
                usersDTO.getPassword(),
                usersDTO.getRole(),
                usersDTO.getCreated_at(),
                usersDTO.getId()
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

            usersDTO.setId(rs.getString(1));
            usersDTO.setUsername(rs.getString(2));
            usersDTO.setEmail(rs.getString(3));
            usersDTO.setPassword(rs.getString(4));
            usersDTO.setRole(rs.getString(5));
            usersDTO.setCreated_at(rs.getTimestamp(6).toLocalDateTime());
            return usersDTO;
        });
        return usersDTOList;
    }
}
