package com.hearthstone.api.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hearthstone.api.dto.CardDTO;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;
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
	
	@Transactional
	public ResponseEntity<?> findByFilters(Long id, String name, CardType type, CardClass cardClass){
		var nameLike = "%" + name + "%";
		var cardList = repository.findByIdOrNameIgnoreCaseLikeOrTypeOrCardClass(id, nameLike, type, cardClass);
		return ResponseEntity.ok(cardList);
	}
	
	@Transactional
	public ResponseEntity<?> delete(Long id){
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
