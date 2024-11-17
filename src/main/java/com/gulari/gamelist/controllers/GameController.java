package com.gulari.gamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulari.gamelist.dto.GameMaxDTO;
import com.gulari.gamelist.dto.GameMinDTO;
import com.gulari.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.getAllGames();
	}
	
	@GetMapping(value = "/{id}")
	public GameMaxDTO findById(@PathVariable Long id) {
		return gameService.findById(id);
	}
}
