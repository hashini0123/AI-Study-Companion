package edu.icet.repository.Impl;

import edu.icet.dto.DocumentsDTO;
import edu.icet.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DocumentRepositoryImpl implements DocumentRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void saveDocument(DocumentsDTO documentsDTO) {
        String sql = "INSERT INTO documents (user_id,file_name,file_path,uploaded) VALUE(?,?,?,?)";
        jdbcTemplate.update(sql,
                documentsDTO.getUser_id(),
                documentsDTO.getFile_name(),
                documentsDTO.getFile_path(),
                documentsDTO.getUploaded_at()
        );
    }

    @Override
    public boolean updateDocument(DocumentsDTO documentsDTO) {
        String sql = "UPDATE documents SET user_id=? , file_name=?, file_path=?, uploaded_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                documentsDTO.getUser_id(),
                documentsDTO.getFile_name(),
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

    @Override
    public List<DocumentsDTO> getAllDocument() {
        String sql = "SELECT * FROM documents";
        List<DocumentsDTO> documentsDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {

            DocumentsDTO documentsDTO = new DocumentsDTO();

            documentsDTO.setId(rs.getLong(1));
            documentsDTO.setUser_id(rs.getString(2));
            documentsDTO.setFile_name(rs.getString(3));
            documentsDTO.setFile_path(rs.getString(4));
            documentsDTO.setUploaded_at(rs.getTimestamp(5).toLocalDateTime());
            return documentsDTO;
        });
        return documentsDTOList;
    }
}
