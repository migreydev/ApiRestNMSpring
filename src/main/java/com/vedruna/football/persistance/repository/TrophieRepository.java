package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedruna.football.persistance.models.Trophie;

public interface TrophieRepository extends JpaRepository<Trophie, Integer>{

	Trophie findTrophieBytitle(String title);
	Trophie findTrophieByidtrophie(int idtrophie);
}
