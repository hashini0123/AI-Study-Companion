package edu.icet.controller;

import edu.icet.dto.QuizzesDTO;
import edu.icet.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/quizzes")
public class QuizController {

    public final QuizService quizService;

    @PostMapping("/save")
    public ResponseEntity<String> saveQuiz(@RequestBody QuizzesDTO quizzesDTO){
        quizService.saveQuiz(quizzesDTO);
        return ResponseEntity.ok("Document saved successfully!");
    }

}
