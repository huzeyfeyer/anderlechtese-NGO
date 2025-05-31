package be.ehb.huzeyfe_yer.controllers;

import be.ehb.huzeyfe_yer.model.Location;
import be.ehb.huzeyfe_yer.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller

public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }



    // Toont alle locaties in een aparte pagina (optioneel)
    @GetMapping("/locaties")
    public String toonLocaties(Model model) {
        List<Location> locaties = locationService.findAll();
        model.addAttribute("locaties", locaties);
        return "locaties";
    }



}
