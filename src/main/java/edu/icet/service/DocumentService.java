package edu.icet.service;

import edu.icet.dto.DocumentsDTO;

import java.util.List;

public interface DocumentService {
    void saveDocument(DocumentsDTO documentsDTO);

    boolean updateDocument(DocumentsDTO documentsDTO);

    boolean deleteDocument(String id);

    List<DocumentsDTO> getAllDocument();
}
