package com.zyknafein.roleplaycharactereditor.models.skill;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class NaturalSkill extends Skill {

    public NaturalSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<NaturalSkill> initSkillList(Integer characterId) {
        List<NaturalSkill> naturalSkillList = new ArrayList<>();
        naturalSkillList.add(new NaturalSkill(getId(),characterId,"Chasse", "Nature", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        naturalSkillList.add(new NaturalSkill(getId(),characterId,"Pêche", "Nature", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        naturalSkillList.add(new NaturalSkill(getId(),characterId,"Cuisine", "Nature", "FOC", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        naturalSkillList.add(new NaturalSkill(getId(),characterId,"Contact animal", "Nature", "CHA", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        naturalSkillList.add(new NaturalSkill(getId(),characterId,"Survie", "Nature", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        return naturalSkillList;
    }
}
