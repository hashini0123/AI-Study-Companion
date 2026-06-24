package edu.icet.controller;

import edu.icet.dto.QuestionsDTO;
import edu.icet.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping("/save")
    public ResponseEntity<String> saveQuestion(@RequestBody QuestionsDTO questionsDTO){
        questionService.saveQuestion(questionsDTO);
        return ResponseEntity.ok("Question saved successfully!");
    }
}
