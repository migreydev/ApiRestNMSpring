package com.vedruna.football.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PlayerHasTrophyDTO {
    private int playerId;
    private int trophieId;
}
