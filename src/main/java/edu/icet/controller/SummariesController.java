package edu.icet.controller;

import edu.icet.dto.SummariesDTO;
import edu.icet.service.SummariesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/summaries")
public class SummariesController {

    public final SummariesService summariesService;

    @PostMapping("/save")
    public ResponseEntity<String> saveSummary(@RequestBody SummariesDTO summariesDTO){
        summariesService.saveSummary(summariesDTO);
        return ResponseEntity.ok("Summary saved successfully!");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateSummary(@RequestBody SummariesDTO summariesDTO){
        boolean isUpdate = summariesService.updateSummary(summariesDTO);

        if(isUpdate){
            return ResponseEntity.ok("Summary update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Summary not found!");
        }
    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteSummary(@PathVariable String id){
        boolean isDelete = summariesService.deleteSummary(id);

        if(isDelete){
            return ResponseEntity.ok("Summary delete successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Document not found!");
        }
    }

    @GetMapping("/get-All")
    public ResponseEntity<List<SummariesDTO>> getAllSummary(){
        List<SummariesDTO> AllSummary = summariesService.getAllSummary();
        return ResponseEntity.ok(AllSummary);
    }

}
