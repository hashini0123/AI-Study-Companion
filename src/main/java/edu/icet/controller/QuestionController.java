package edu.icet.controller;

import edu.icet.dto.QuestionsDTO;
import edu.icet.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update")
    public ResponseEntity<String> updateQuestion(@RequestBody QuestionsDTO questionsDTO){
        boolean isUpdate = questionService.updateQuestion(questionsDTO);

        if(isUpdate){
            return ResponseEntity.ok("Question update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quiz not found!");
        }
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable String id){
        boolean isDelete = questionService.deleteQuestion(id);
        if(isDelete){
            return ResponseEntity.ok("Question delete successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Question not found!");
        }
    }
}
