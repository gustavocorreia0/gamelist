package com.gulari.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gulari.gamelist.dto.GameMaxDTO;
import com.gulari.gamelist.dto.GameMinDTO;
import com.gulari.gamelist.entities.Game;
import com.gulari.gamelist.projections.GameMinProjection;
import com.gulari.gamelist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> getAllGames() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameMaxDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameMaxDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> getGamesByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
