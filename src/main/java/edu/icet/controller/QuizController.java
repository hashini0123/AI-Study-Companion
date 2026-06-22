package edu.icet.controller;

import edu.icet.dto.QuizzesDTO;
import edu.icet.service.QuizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/update")
    public ResponseEntity<String> updateQuiz(@RequestBody QuizzesDTO quizzesDTO){
        boolean isUpdate = quizService.updateQuiz(quizzesDTO);

        if(isUpdate){
            return ResponseEntity.ok("Quiz update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quiz not found!");
        }
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteQuiz(@PathVariable String id){
        boolean isDelete = quizService.deleteQuiz(id);

        if(isDelete){
            return ResponseEntity.ok("Quiz delete successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Quiz not found!");
        }
    }

}
