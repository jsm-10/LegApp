package JSM.LegalApp.LegApp.controller;

import JSM.LegalApp.LegApp.model.LegalRequest;
import JSM.LegalApp.LegApp.service.LegalRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class LegalRequestController {
    @Autowired
    private LegalRequestService legalRequestService;

    @PostMapping
    public ResponseEntity<LegalRequest> createRequest(@RequestBody LegalRequest legalRequest) {
        LegalRequest createdRequest = legalRequestService.createRequest(legalRequest);
        return ResponseEntity.ok(createdRequest);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<LegalRequest>> getRequestsByUserId(@PathVariable Long userId) {
        List<LegalRequest> requests = legalRequestService.getRequestsByUserId(userId);
        return ResponseEntity.ok(requests);
    }
}
