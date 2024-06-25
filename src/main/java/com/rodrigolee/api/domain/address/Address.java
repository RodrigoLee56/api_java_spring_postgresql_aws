package com.rodrigolee.api.domain.address;

import java.util.UUID;

import com.rodrigolee.api.domain.events.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	public UUID id;
	private String city;
	private String uf;

	
	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;
}
