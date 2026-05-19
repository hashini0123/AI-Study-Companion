package edu.icet.repository.Impl;

import edu.icet.dto.UserDTO;
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

    @Override
    public List<UserDTO> getAll() {
        String sql = "SELECT * FROM user";

        List<UserDTO> userDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {

            UserDTO userDTO = new UserDTO();

            userDTO.setId(String.valueOf(rs.getLong(1)));
            userDTO.setUserName(rs.getString(2));
            userDTO.setEmail(rs.getString(3));
            userDTO.setCreatedAt(rs.getTimestamp(4).toLocalDateTime());
            return userDTO;
        });
        return userDTOList;
    }
}
