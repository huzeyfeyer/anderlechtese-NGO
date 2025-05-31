package be.ehb.huzeyfe_yer.service;

import be.ehb.huzeyfe_yer.model.Event;
import be.ehb.huzeyfe_yer.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;



    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    // Haalt de laatste 10 evenementen op, gesorteerd op aflopende datum
    public List<Event> findLast10() {
        List<Event> allEvents = eventRepository.findAll();
        return allEvents.stream()
                .sorted((a, b) -> b.getTime().compareTo(a.getTime()))
                .limit(10)
                .toList();
    }


    // Zoekt een specifiek evenement op ID
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }


    // Slaat een nieuw evenement op
    public Event save(Event event) {
        return eventRepository.save(event);
    }


}
