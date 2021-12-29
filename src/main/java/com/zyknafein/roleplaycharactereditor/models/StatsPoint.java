package com.zyknafein.roleplaycharactereditor.models;


import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class StatsPoint {

    Integer availableStatsPoints;
    Map<String,Integer> Strength;
    Map<String,Integer> Dexterity;
    Map<String,Integer> Constitution;
    Map<String,Integer> Intelligence;
    Map<String,Integer> Wisdom;
    Map<String,Integer> Charisma;

    public StatsPoint(Integer availableStatsPoints, Map<String, Integer> strength, Map<String, Integer> dexterity, Map<String, Integer> constitution, Map<String, Integer> intelligence, Map<String, Integer> wisdom, Map<String, Integer> charisma) {
        this.availableStatsPoints = availableStatsPoints;
        Strength = strength;
        Dexterity = dexterity;
        Constitution = constitution;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
    }
}
