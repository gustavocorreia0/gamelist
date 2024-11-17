package com.gulari.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulari.gamelist.dto.GameListDTO;
import com.gulari.gamelist.services.GameListServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListServices gameListServices;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListServices.getAllLists();
	}
	
}
