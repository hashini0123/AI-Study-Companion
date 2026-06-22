package edu.icet.repository;

import edu.icet.dto.QuizzesDTO;

import java.util.List;

public interface QuizRepository {
    void saveQuiz(QuizzesDTO quizzesDTO);

    boolean updateQuiz(QuizzesDTO quizzesDTO);

    boolean deleteById(String id);

    List<QuizzesDTO> getAllQuiz();
}
