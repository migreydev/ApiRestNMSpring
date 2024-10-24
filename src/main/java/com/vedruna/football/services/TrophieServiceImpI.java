package com.vedruna.football.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.football.persistance.repository.TrophieRepository;

@Service
public class TrophieServiceImpI implements TrophieServiceI{
	
	@Autowired
	TrophieRepository trophieRepository;

}
