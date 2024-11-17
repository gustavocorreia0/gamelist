package com.gulari.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulari.gamelist.dto.GameDTO;
import com.gulari.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameDTO> findAll(){
		return gameService.getAllGames();
	}
}
