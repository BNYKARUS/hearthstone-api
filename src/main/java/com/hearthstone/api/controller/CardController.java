package com.hearthstone.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.hearthstone.api.dto.CardDTO;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;
import com.hearthstone.api.resource.CardResource;
import com.hearthstone.api.service.CardService;

@RestController
public class CardController implements CardResource {
	@Autowired
	private CardService service;

	@Override
	public ResponseEntity<?> findByFilters(Long id, String name, CardClass cardClass, CardType type) {
		return service.findByFilters(id, name, type, cardClass);
	}

	@Override
	public ResponseEntity<?> create(CardDTO card) {
		return service.create(card);
	}

	@Override
	public ResponseEntity<?> delete(Long id) {
		return service.delete(id);
	}

}
