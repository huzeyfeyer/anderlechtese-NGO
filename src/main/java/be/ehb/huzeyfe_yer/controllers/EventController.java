package be.ehb.huzeyfe_yer.controllers;

import be.ehb.huzeyfe_yer.model.Event;
import be.ehb.huzeyfe_yer.model.Location;
import be.ehb.huzeyfe_yer.service.EventService;
import be.ehb.huzeyfe_yer.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventController {

    private final EventService eventService;
    private final LocationService locationService;

    public EventController(EventService eventService, LocationService locationService) {
        this.eventService = eventService;
        this.locationService = locationService;
    }

    // Toont de 10 laatste evenementen op de hoofdpagina
    @GetMapping("/")
    public String showIndex(Model model) {
        List<Event> events = eventService.findLast10();
        model.addAttribute("events", events);
        return "index";
    }

    // Toont het formulier om een nieuw evenement toe te voegen
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("event", new Event());
        model.addAttribute("locations", locationService.findAll());
        return "new";
    }

    // Verwerkt het formulier en slaat het evenement op
    @PostMapping("/new")
    public String submitForm(@ModelAttribute Event event) {
        eventService.save(event);
        return "redirect:/";

    }

    // Toont de details van een specifiek evenement
    @GetMapping("/details/{id}")
    public String showDetails(@PathVariable Long id, Model model) {
        eventService.findById(id).ifPresent(e -> model.addAttribute("event", e));
        return "details";
    }

}
