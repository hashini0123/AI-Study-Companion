package edu.icet.service;

import edu.icet.dto.SummariesDTO;

public interface SummariesService {
    void saveSummary(SummariesDTO summariesDTO);

    boolean updateSummary(SummariesDTO summariesDTO);

    boolean deleteSummary(String id);
}
