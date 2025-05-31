package be.ehb.huzeyfe_yer.service;

import be.ehb.huzeyfe_yer.model.Location;
import be.ehb.huzeyfe_yer.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {


    private final LocationRepository locationRepository;


    public LocationService(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    // Haalt alle locaties op uit de database
    public List<Location> findAll() {
        return locationRepository.findAll();
    }


}
