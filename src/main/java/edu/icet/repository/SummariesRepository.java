package edu.icet.repository;

import edu.icet.dto.SummariesDTO;

import java.util.List;

public interface SummariesRepository {
    void saveSummary(SummariesDTO summariesDTO);

    boolean updateSummary(SummariesDTO summariesDTO);

    boolean deleteById(String id);

    List<SummariesDTO> getAllSummary();
}
