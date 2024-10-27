package com.vedruna.football.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.football.persistance.models.PlayerHasTrophy;
import com.vedruna.football.persistance.models.PlayerHasTrophyId;

@Repository
public interface PlayerHasTrophyRepository extends JpaRepository<PlayerHasTrophy, PlayerHasTrophyId> {
  
}
