package com.gulari.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gulari.gamelist.dto.GameDTO;
import com.gulari.gamelist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameDTO> getAllGames() {
		return gameRepository.findAll().stream().map(x -> new GameDTO(x)).toList();
	}
	
}
