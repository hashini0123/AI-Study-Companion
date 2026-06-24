package edu.icet.service.Impl;

import edu.icet.dto.QuestionsDTO;
import edu.icet.repository.QuestionRepository;
import edu.icet.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public void saveQuestion(QuestionsDTO questionsDTO) {
        questionRepository.saveQuestion(questionsDTO);
    }
}
