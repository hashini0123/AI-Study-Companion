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
    public void saveSummarie(SummariesDTO summariesDTO) {
        String sql = "INSERT INTO summaries VALUE (?,?,?,?)";
        jdbcTemplate.update(sql,
                summariesDTO.getId(),
                summariesDTO.getDocumentId(),
                summariesDTO.getSummaryText(),
                summariesDTO.getCreatedAt()
                );
    }
}
