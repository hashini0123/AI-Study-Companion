package edu.icet.service;

import edu.icet.dto.QuestionsDTO;

import java.util.List;

public interface QuestionService {
    void saveQuestion(QuestionsDTO questionsDTO);

    boolean updateQuestion(QuestionsDTO questionsDTO);

    boolean deleteQuestion(String id);

    List<QuestionsDTO> getAllQuestion();
}
