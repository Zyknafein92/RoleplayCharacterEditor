package com.zyknafein.roleplaycharactereditor.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
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
