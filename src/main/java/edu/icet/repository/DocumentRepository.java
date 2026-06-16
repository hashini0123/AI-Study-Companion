package edu.icet.repository;

import edu.icet.dto.DocumentsDTO;

import java.util.List;

public interface DocumentRepository {
    void saveDocument(DocumentsDTO documentsDTO);

    boolean updateDocument(DocumentsDTO documentsDTO);

    boolean deleteById(String id);

    List<DocumentsDTO> getAllDocument();
}
