package edu.icet.service.Impl;

import edu.icet.dto.SummariesDTO;
import edu.icet.repository.SummariesRepository;
import edu.icet.service.SummariesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SummariesServiceImpl implements SummariesService {

    private final SummariesRepository summariesRepository;

    @Override
    public void saveSummary(SummariesDTO summariesDTO) {
        summariesRepository.saveSummarie(summariesDTO);
    }
}
