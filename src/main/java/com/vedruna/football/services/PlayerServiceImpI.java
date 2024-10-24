package com.vedruna.football.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.vedruna.football.persistance.repository.PlayerRepository;

public class PlayerServiceImpI implements PlayerServiceI{
	
	@Autowired
	PlayerRepository playerRepository;

}
