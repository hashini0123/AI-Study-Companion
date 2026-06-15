package edu.icet.service.Impl;

import edu.icet.dto.DocumentsDTO;
import edu.icet.repository.DocumentRepository;
import edu.icet.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Override
    public void saveDocument(DocumentsDTO documentsDTO) {
        documentRepository.saveDocument(documentsDTO);
    }

    @Override
    public boolean updateDocument(DocumentsDTO documentsDTO) {
        return documentRepository.updateDocument(documentsDTO);
    }

    @Override
    public boolean deleteDocument(String id) {
        return documentRepository.deleteById(id);
    }
}
