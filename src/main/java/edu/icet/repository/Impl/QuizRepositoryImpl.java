package edu.icet.repository.Impl;

import edu.icet.dto.QuizzesDTO;
import edu.icet.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuizRepositoryImpl implements QuizRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void saveQuiz(QuizzesDTO quizzesDTO) {
        String sql = "INSERT INTO quizzes (document_id, title, created_at) VALUES(?,?,?)";
        jdbcTemplate.update(sql,
                quizzesDTO.getDocument_id(),
                quizzesDTO.getTitle(),
                quizzesDTO.getCreated_at()
        );
    }

    @Override
    public boolean updateQuiz(QuizzesDTO quizzesDTO) {
        String sql = "UPDATE quizzes SET document_id=?, title=?, created_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                quizzesDTO.getDocument_id(),
                quizzesDTO.getTitle(),
                quizzesDTO.getCreated_at(),
                quizzesDTO.getId()
        ) > 0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM quizzes WHERE id=?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    @Override
    public List<QuizzesDTO> getAllQuiz() {
        String sql = "SELECT * FROM quizzes";
        List<QuizzesDTO> quizzesDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {

            QuizzesDTO quizzesDTO = new QuizzesDTO();

            quizzesDTO.setId(rs.getLong(1));
            quizzesDTO.setDocument_id(rs.getLong(2));
            quizzesDTO.setTitle(rs.getString(3));
            quizzesDTO.setCreated_at(rs.getTimestamp(4).toLocalDateTime());
            return quizzesDTO;
        });
        return quizzesDTOList;
    }
}


