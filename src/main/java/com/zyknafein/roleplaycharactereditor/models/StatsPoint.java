package com.zyknafein.roleplaycharactereditor.models;


import lombok.*;

import java.util.Map;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StatsPoint {

    Integer availableStatsPoints;
    Map<String,Integer> Strength;
    Map<String,Integer> Dexterity;
    Map<String,Integer> Constitution;
    Map<String,Integer> Intelligence;
    Map<String,Integer> Wisdom;
    Map<String,Integer> Charisma;

}
