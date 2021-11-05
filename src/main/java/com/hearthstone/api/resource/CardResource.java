package com.hearthstone.api.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hearthstone.api.dto.CardDTO;
import com.hearthstone.api.model.enums.CardClass;
import com.hearthstone.api.model.enums.CardType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping(path = "/v1/card")
@Api(value = "/v1/card", tags = "Operations about cards")
public interface CardResource {

	@GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Find card by id, name, cardClass, type", response = CardDTO.class)
	public ResponseEntity<?> findByFilters(@RequestParam(required = false) Long id, 
											@RequestParam(required = false) String name,
											@RequestParam(required = false) CardClass cardClass,
											@RequestParam(required = false) CardType type);
									
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Create new card", response = Void.class)
	public ResponseEntity<?> create(@RequestBody CardDTO card);
	
	@DeleteMapping(value = "/delete/{id}")
	@ApiOperation(value = "Delete a card", response = Void.class)
	public ResponseEntity<?> delete(@PathVariable("id") Long id);
	
}
