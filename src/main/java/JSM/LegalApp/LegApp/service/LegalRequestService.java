package JSM.LegalApp.LegApp.service;

import JSM.LegalApp.LegApp.model.LegalRequest;
import JSM.LegalApp.LegApp.repository.LegalRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalRequestService {
    @Autowired
    private LegalRequestRepository legalRequestRepository;

    public LegalRequest createRequest(LegalRequest legalRequest) {
        return legalRequestRepository.save(legalRequest);
    }

    public List<LegalRequest> getRequestsByUserId(Long userId) {
        return legalRequestRepository.findByUserId(userId);
    }
}
