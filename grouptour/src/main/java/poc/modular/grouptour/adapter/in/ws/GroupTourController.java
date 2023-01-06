package poc.modular.grouptour.adapter.in.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import poc.modular.grouptour.application.port.in.ws.GroupTourService;
import poc.modular.grouptour.application.port.in.ws.dto.GroupTour;

@RestController
@AllArgsConstructor
class GroupTourController {

    private final GroupTourService groupTourService;

    @GetMapping("/groupTour/{identifier}")
    GroupTour getGroupTourByIdentifier(@PathVariable String identifier) {
        return groupTourService.getGroupTourByIdentifier(identifier);
    }
}
