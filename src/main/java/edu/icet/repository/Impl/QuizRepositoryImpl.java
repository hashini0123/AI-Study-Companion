package edu.icet.repository.Impl;

import edu.icet.dto.QuizzesDTO;
import edu.icet.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
                )>0;
    }
}
