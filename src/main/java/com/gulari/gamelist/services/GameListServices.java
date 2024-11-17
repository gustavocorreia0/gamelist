package com.gulari.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gulari.gamelist.dto.GameListDTO;
import com.gulari.gamelist.entities.GameList;
import com.gulari.gamelist.repositories.GameListRepository;

@Service
public class GameListServices {
	
	@Autowired
	private GameListRepository listRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> getAllLists(){
		List<GameList> result = listRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
