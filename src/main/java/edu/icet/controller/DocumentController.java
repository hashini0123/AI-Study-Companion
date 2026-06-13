package edu.icet.controller;

import edu.icet.dto.DocumentsDTO;
import edu.icet.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/documents")
public class DocumentController {

    private final DocumentService documentService;

    @PostMapping("/save")
    public ResponseEntity<String> saveDocument(@RequestBody DocumentsDTO documentsDTO){
        documentService.saveDocument(documentsDTO);
        return ResponseEntity.ok("Document saved successfully!");
    }


}
