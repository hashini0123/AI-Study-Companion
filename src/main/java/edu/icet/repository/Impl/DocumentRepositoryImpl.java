package edu.icet.repository.Impl;

import edu.icet.dto.DocumentsDTO;
import edu.icet.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DocumentRepositoryImpl implements DocumentRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void saveDocument(DocumentsDTO documentsDTO) {
        String sql = "INSERT INTO documents VALUE(?,?,?,?,?)";
        jdbcTemplate.update(sql,
                documentsDTO.getId(),
                documentsDTO.getUser_id(),
                documentsDTO.getFilea_name(),
                documentsDTO.getFile_path(),
                documentsDTO.getUploaded_at()
        );
    }

    @Override
    public boolean updateDocument(DocumentsDTO documentsDTO) {
        String sql = "UPDATE documents SET user_id=? , file_name=?, file_path=?, uploaded_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                documentsDTO.getUser_id(),
                documentsDTO.getFilea_name(),
                documentsDTO.getFile_path(),
                documentsDTO.getUploaded_at(),
                documentsDTO.getId()
                )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM documents WHERE id=?";
        return jdbcTemplate.update(sql,id)>0;
    }
}
