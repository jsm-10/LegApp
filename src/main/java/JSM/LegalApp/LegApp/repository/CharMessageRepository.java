package JSM.LegalApp.LegApp.repository;

import JSM.LegalApp.LegApp.model.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharMessageRepository extends JpaRepository<ChatMessage, Long> {
}
