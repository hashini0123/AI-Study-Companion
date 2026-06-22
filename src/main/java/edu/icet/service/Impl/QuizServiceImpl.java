package edu.icet.service.Impl;

import edu.icet.dto.QuizzesDTO;
import edu.icet.repository.QuizRepository;
import edu.icet.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    @Override
    public void saveQuiz(QuizzesDTO quizzesDTO) {
        quizRepository.saveQuiz(quizzesDTO);
    }

    @Override
    public boolean updateQuiz(QuizzesDTO quizzesDTO) {
        return quizRepository.updateQuiz(quizzesDTO);
    }

    @Override
    public boolean deleteQuiz(String id) {
        return quizRepository.deleteById(id);
    }
}
