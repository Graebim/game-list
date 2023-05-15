package com.mibeargui.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mibeargui.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
