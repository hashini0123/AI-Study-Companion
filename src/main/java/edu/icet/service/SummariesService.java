package edu.icet.service;

import edu.icet.dto.SummariesDTO;

import java.util.List;

public interface SummariesService {
    void saveSummary(SummariesDTO summariesDTO);

    boolean updateSummary(SummariesDTO summariesDTO);

    boolean deleteSummary(String id);

    List<SummariesDTO> getAllSummary();
}
