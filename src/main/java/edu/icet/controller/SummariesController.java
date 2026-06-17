package edu.icet.controller;

import edu.icet.dto.SummariesDTO;
import edu.icet.service.SummariesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/summaries")
public class SummariesController {

    public final SummariesService summariesService;

    @PostMapping("/save")
    public ResponseEntity<String> saveSummarie(@RequestBody SummariesDTO summariesDTO){
        summariesService.saveSummarie(summariesDTO);
        return ResponseEntity.ok("Summarie saved successfully!");
    }
}
