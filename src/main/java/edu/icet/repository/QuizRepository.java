package edu.icet.repository;

import edu.icet.dto.QuizzesDTO;

public interface QuizRepository {
    void saveQuiz(QuizzesDTO quizzesDTO);

    boolean updateQuiz(QuizzesDTO quizzesDTO);
}
