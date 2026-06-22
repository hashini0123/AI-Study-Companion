package edu.icet.service;

import edu.icet.dto.QuizzesDTO;

import java.util.List;

public interface QuizService {
    void saveQuiz(QuizzesDTO quizzesDTO);

    boolean updateQuiz(QuizzesDTO quizzesDTO);

    boolean deleteQuiz(String id);

    List<QuizzesDTO> getAllQuiz();
}
