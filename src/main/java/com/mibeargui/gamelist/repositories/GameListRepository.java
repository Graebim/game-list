package com.mibeargui.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
