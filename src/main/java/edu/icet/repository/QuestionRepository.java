package edu.icet.repository;

import edu.icet.dto.QuestionsDTO;

public interface QuestionRepository {
    void saveQuestion(QuestionsDTO questionsDTO);

    boolean updateQuestion(QuestionsDTO questionsDTO);
}
