package poc.modular.grouptour.presentation.ws.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import poc.modular.grouptour.api.GroupTourService;
import poc.modular.grouptour.api.dto.GroupTourWithBookingsDto;

@RestController
@AllArgsConstructor
class GroupTourController {

    private final GroupTourService groupTourService;

    @GetMapping("/groupTour/{identifier}")
    GroupTourWithBookingsDto getGroupTourByIdentifier(@PathVariable String identifier) {
        return groupTourService.getGroupTourByIdentifier(identifier);
    }
}
