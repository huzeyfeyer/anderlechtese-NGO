package be.ehb.huzeyfe_yer.repository;

import be.ehb.huzeyfe_yer.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
