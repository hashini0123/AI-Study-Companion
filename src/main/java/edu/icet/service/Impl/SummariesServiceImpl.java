package edu.icet.service.Impl;

import edu.icet.dto.SummariesDTO;
import edu.icet.repository.SummariesRepository;
import edu.icet.service.SummariesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SummariesServiceImpl implements SummariesService {

    private final SummariesRepository summariesRepository;

    @Override
    public void saveSummary(SummariesDTO summariesDTO) {
        summariesRepository.saveSummary(summariesDTO);
    }

    @Override
    public boolean updateSummary(SummariesDTO summariesDTO) {
        return summariesRepository.updateSummary(summariesDTO);
    }

    @Override
    public boolean deleteSummary(String id) {
        return summariesRepository.deleteById(id);
    }

    @Override
    public List<SummariesDTO> getAllSummary() {
        return summariesRepository.getAllSummary();
    }
}
