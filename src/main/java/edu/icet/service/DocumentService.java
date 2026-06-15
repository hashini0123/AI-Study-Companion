package edu.icet.service;

import edu.icet.dto.DocumentsDTO;

public interface DocumentService {
    void saveDocument(DocumentsDTO documentsDTO);

    boolean updateDocument(DocumentsDTO documentsDTO);
}
