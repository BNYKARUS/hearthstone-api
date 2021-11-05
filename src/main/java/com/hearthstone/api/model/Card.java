package com.hearthstone.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CARD")
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DETAILS")
	private String details;
	@Max(10)
	@Column(name = "ATTACK")
	private Integer attack;
	@Max(10)
	@Column(name = "DEFENSE")
	private Integer defense;
	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE")
	private CardType type;
	@Enumerated(EnumType.STRING)
	@Column(name = "CARD_CLASS")
	private CardClass cardClass;
}
