package com.rodrigolee.api.domain.coupon;

import java.util.Date;
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
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	public UUID id;

	private String code;

	private Integer discount;

	private Date valid;

	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;
}
