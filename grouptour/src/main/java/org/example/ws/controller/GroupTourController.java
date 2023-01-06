package org.example.ws.controller;

import lombok.AllArgsConstructor;
import org.example.dto.GroupTour;
import org.example.service.GroupTourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class GroupTourController {

    private final GroupTourService groupTourService;

    @GetMapping("/groupTour/{identifier}")
    GroupTour getGroupTourByIdentifier(@PathVariable String identifier) {
        return groupTourService.getGroupTourByIdentifier(identifier);
    }
}
