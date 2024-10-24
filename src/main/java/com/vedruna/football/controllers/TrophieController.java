package com.vedruna.football.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.football.services.TrophieServiceImpI;

@RestController
@RequestMapping("/api/v1/trophies")
public class TrophieController {
	
	@Autowired
	TrophieServiceImpI trophieService;

}
