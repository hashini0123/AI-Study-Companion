package edu.icet.repository.Impl;

import edu.icet.dto.SummariesDTO;
import edu.icet.repository.SummariesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<SummariesDTO> getAllSummary() {
        String sql = "SELECT * FROM summaries";
        List<SummariesDTO> summariesDTOList = jdbcTemplate.query(sql , (rs, rowNum) -> {

            SummariesDTO summariesDTO = new SummariesDTO();

            summariesDTO.setId(rs.getLong(1));
            summariesDTO.setDocument_id(rs.getLong(2));
            summariesDTO.setSummary_text(rs.getString(3));
            summariesDTO.setCreated_at(rs.getTimestamp(4).toLocalDateTime());
            return summariesDTO;
        });
        return summariesDTOList;
    }
}
