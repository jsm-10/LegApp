package JSM.LegalApp.LegApp.repository;

import JSM.LegalApp.LegApp.model.LegalRequest;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalRequestRepository extends JpaRepository<LegalRequest, Long> {
   
    List<LegalRequest> findByUserId(Long userId);
}

