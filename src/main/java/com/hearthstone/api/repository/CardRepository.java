package com.hearthstone.api.repository;



import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hearthstone.api.model.Card;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
	
	Set<Card> findByIdOrNameIgnoreCaseLikeOrTypeOrCardClass(Long id, String name, CardType type, CardClass cardClass);
	

}
