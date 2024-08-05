package JSM.LegalApp.LegApp.repository;

import JSM.LegalApp.LegApp.model.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
