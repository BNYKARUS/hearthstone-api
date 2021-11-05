package com.hearthstone.api.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hearthstone.api.dto.CardDTO;
import com.hearthstone.api.repository.CardRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CardService {
	@Autowired
	private CardRepository repository; 
	
	@Transactional
	public ResponseEntity<?> create(CardDTO card){
		repository.save(card.toModel());
		return ResponseEntity.noContent().build();
	}
}
