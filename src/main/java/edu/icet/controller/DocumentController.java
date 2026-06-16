package edu.icet.controller;

import edu.icet.dto.DocumentsDTO;
import edu.icet.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("/update")
    public ResponseEntity<String> updateDocument(@RequestBody DocumentsDTO documentsDTO){
        boolean isUpdate = documentService.updateDocument(documentsDTO);

        if(isUpdate){
            return ResponseEntity.ok("Document update successfully!");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Document not found!");
        }

    }

    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<String> deleteDocument(@PathVariable String id){
        boolean isDelete = documentService.deleteDocument(id);

        if(isDelete){
            return ResponseEntity.ok("User delete successfully!");
        }else{

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
        }
    }

    @GetMapping("/get-All")
    public ResponseEntity<List<DocumentsDTO>> getAllDocument(){
        List<DocumentsDTO> allDocument = documentService.getAllDocument();
        return ResponseEntity.ok(allDocument);
    }


}
