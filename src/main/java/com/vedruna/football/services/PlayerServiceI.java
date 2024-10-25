package com.vedruna.football.services;

import java.util.List;

import com.vedruna.football.dto.PlayerDTO;

public interface PlayerServiceI {

	List<PlayerDTO> getAllPlayers();
	PlayerDTO getPlayerByUsername(String username);
	void addPlayer(PlayerDTO playerDTO);
	void deletePlayer(PlayerDTO playerDTO);
	PlayerDTO getPlayerByIdplayer(int id);
}
