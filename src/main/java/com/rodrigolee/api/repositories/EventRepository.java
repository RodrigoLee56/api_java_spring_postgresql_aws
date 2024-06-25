package com.rodrigolee.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigolee.api.domain.events.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{

}
