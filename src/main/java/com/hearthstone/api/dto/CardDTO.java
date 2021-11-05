package com.hearthstone.api.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

import com.hearthstone.api.model.Card;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CardDTO {
	private @Id @GeneratedValue Long id;
	private String name;
	private String details;
	@Max(10)
	private Integer attack;
	@Max(10)
	private Integer defense;
	private String type;
	private String cardClass;
	
	public Card toModel() {
		return Card.builder()
				.id(id)
				.name(name)
				.details(details)
				.attack(attack)
				.defense(defense)
				.type(type)
				.cardClass(cardClass)
				.build();
				
			
	}

}
