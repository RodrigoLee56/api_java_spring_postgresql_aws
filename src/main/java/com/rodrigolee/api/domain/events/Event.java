package com.rodrigolee.api.domain.events;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	public UUID id;

	private String title;
	
	private String description;
	
	private String imgUrl;
	
	private String eventUrl;
	
	private Boolean remote;
	
	private Date dateEvent;
}
