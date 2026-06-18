package edu.icet.controller;

import edu.icet.dto.SummariesDTO;
import edu.icet.service.SummariesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
