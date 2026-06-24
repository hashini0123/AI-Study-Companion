package edu.icet.service;

import edu.icet.dto.QuestionsDTO;

public interface QuestionService {
    void saveQuestion(QuestionsDTO questionsDTO);

    boolean updateQuestion(QuestionsDTO questionsDTO);
}
