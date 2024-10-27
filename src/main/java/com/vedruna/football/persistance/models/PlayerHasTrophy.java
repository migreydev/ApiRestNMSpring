package com.vedruna.football.persistance.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@IdClass(PlayerHasTrophyId.class) 
@Table(name="players_has_trophies")
public class PlayerHasTrophy {
	
	@Id
    @ManyToOne
    @JoinColumn(name = "players_idplayer")
	private Player player;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "trophies_idtrophie")
	private Trophie trophie;
	
}
