package com.gulari.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gulari.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
