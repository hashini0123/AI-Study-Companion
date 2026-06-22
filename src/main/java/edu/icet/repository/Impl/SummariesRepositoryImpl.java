package edu.icet.repository.Impl;

import edu.icet.dto.SummariesDTO;
import edu.icet.repository.SummariesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SummariesRepositoryImpl implements SummariesRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public void saveSummary(SummariesDTO summariesDTO) {
        String sql = "INSERT INTO summaries VALUE (?,?,?,?)";
        jdbcTemplate.update(sql,
                summariesDTO.getId(),
                summariesDTO.getDocument_id(),
                summariesDTO.getSummary_text(),
                summariesDTO.getCreated_at()
                );
    }

    @Override
    public boolean updateSummary(SummariesDTO summariesDTO) {
        String sql = "UPDATE summaries SET document_id=?, summary_text=?, created_at=? WHERE id=?";
        return jdbcTemplate.update(sql,
                summariesDTO.getDocument_id(),
                summariesDTO.getSummary_text(),
                summariesDTO.getCreated_at(),
                summariesDTO.getId()
                )>0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM summaries WHERE id=?";
        return jdbcTemplate.update(sql,id)>0;
    }
}
