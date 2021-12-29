package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class StatsPointDTO {
    Integer availableStatsPoints;
    Map<String,Integer> Strength;
    Map<String,Integer> Dexterity;
    Map<String,Integer> Constitution;
    Map<String,Integer> Intelligence;
    Map<String,Integer> Wisdom;
    Map<String,Integer> Charisma;
}
