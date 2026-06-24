package edu.icet.repository;

import edu.icet.dto.QuestionsDTO;

import java.util.List;

public interface QuestionRepository {
    void saveQuestion(QuestionsDTO questionsDTO);

    boolean updateQuestion(QuestionsDTO questionsDTO);

    boolean deleteQuestion(String id);

    List<QuestionsDTO> getAllQuestion();
}
