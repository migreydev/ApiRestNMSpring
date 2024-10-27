package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	
	Player findByUsername(String username);
	Player findByidplayer(int id);
	
	
}
