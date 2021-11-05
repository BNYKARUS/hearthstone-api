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
	private Long id;
	private String name;
	private String details;
	@Max(10)
	private Integer attack;
	@Max(10)
	private Integer defense;
	private CardType type;
	private CardClass cardClass;
	
	public Card toModel() {
		return Card.builder()
				.name(name)
				.details(details)
				.attack(attack)
				.defense(defense)
				.type(type)
				.cardClass(cardClass)
				.build();
				
			
	}

}
