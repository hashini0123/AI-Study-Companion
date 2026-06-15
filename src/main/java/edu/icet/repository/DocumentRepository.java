package edu.icet.repository;

import edu.icet.dto.DocumentsDTO;

public interface DocumentRepository {
    void saveDocument(DocumentsDTO documentsDTO);

    boolean updateDocument(DocumentsDTO documentsDTO);
}
