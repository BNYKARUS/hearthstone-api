package com.hearthstone.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hearthstone.api.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
