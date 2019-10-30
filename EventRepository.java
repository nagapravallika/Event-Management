package com.event.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evententities.EventEntitites;

public interface EventRepository extends JpaRepository<EventEntitites, Integer> {

	EventEntitites findone(int id);

	
}
