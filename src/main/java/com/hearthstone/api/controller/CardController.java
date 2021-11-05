package com.hearthstone.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.hearthstone.api.dto.CardDTO;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;
import com.hearthstone.api.resource.CardResource;
import com.hearthstone.api.service.CardService;

public class CardController implements CardResource {
	@Autowired
	private CardService service;

	@Override
	public ResponseEntity<?> find(Long id, String name, CardClass cardClass, CardType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> create(CardDTO carta) {
		return service.create(carta);
	} 

}
