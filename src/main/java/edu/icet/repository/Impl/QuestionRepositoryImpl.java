package edu.icet.repository.Impl;

import edu.icet.dto.QuestionsDTO;
import edu.icet.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuestionRepositoryImpl implements QuestionRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void saveQuestion(QuestionsDTO questionsDTO) {
        String sql = "INSERT INTO questions (quiz_id, question_text, option_a, option_b, option_c, option_d, correct_option) VALUE (?,?,?,?,?,?,?) ";
        jdbcTemplate.update(sql,
                questionsDTO.getQuiz_id(),
                questionsDTO.getQuestion_text(),
                questionsDTO.getOption_a(),
                questionsDTO.getOption_b(),
                questionsDTO.getOption_c(),
                questionsDTO.getOption_d(),
                questionsDTO.getCorrect_option()
        );
    }

    @Override
    public boolean updateQuestion(QuestionsDTO questionsDTO) {
        String sql = "UPDATE questions SET quiz_id=? , question_text=? , option_a=? , option_b=? , option_c=? , option_d=? , correct_option=? WHERE id=?";
        return jdbcTemplate.update(sql,
                questionsDTO.getQuiz_id(),
                questionsDTO.getQuestion_text(),
                questionsDTO.getOption_a(),
                questionsDTO.getOption_b(),
                questionsDTO.getOption_c(),
                questionsDTO.getOption_d(),
                questionsDTO.getCorrect_option(),
                questionsDTO.getId()
        )>0;
    }

    @Override
    public boolean deleteQuestion(String id) {
        String sql = "DELETE FROM questions WHERE id=?";
        return jdbcTemplate.update(sql, id)>0;
    }

    @Override
    public List<QuestionsDTO> getAllQuestion() {
        String sql = "SELECT * FROM questions";
        List<QuestionsDTO> questionsDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {

            QuestionsDTO questionsDTO = new QuestionsDTO();

            questionsDTO.setId(rs.getLong(1));
            questionsDTO.setQuiz_id(rs.getLong(2));
            questionsDTO.setQuestion_text(rs.getString(3));
            questionsDTO.setOption_a(rs.getString(4));
            questionsDTO.setOption_b(rs.getString(5));
            questionsDTO.setOption_c(rs.getString(6));
            questionsDTO.setOption_d(rs.getString(7));
            questionsDTO.setCorrect_option(rs.getString(8));
            return questionsDTO;
        });

        return questionsDTOList;

    }
}
