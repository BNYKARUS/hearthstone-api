package com.hearthstone.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
@Table(name = "CARTA")
public class Card {
	@Column(name = "ID")
	private @Id @GeneratedValue Long id;
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
	@Column(name = "TYPE")
	private String type;
	@Column(name = "CARD_CLASS")
	private String cardClass;
}
