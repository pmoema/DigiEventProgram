package com.digievent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.digievent.entity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

	Event findByEventKey(String eventKey);

}
