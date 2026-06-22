package edu.icet.repository;

import edu.icet.dto.SummariesDTO;

public interface SummariesRepository {
    void saveSummary(SummariesDTO summariesDTO);

    boolean updateSummary(SummariesDTO summariesDTO);

    boolean deleteById(String id);
}
