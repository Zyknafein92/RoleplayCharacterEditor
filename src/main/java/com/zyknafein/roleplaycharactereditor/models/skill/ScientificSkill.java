package com.zyknafein.roleplaycharactereditor.models.skill;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class ScientificSkill extends Skill {

    public ScientificSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<ScientificSkill> initSkillList(Integer characterId) {
        List<ScientificSkill> scientificSkillList = new ArrayList<>();

        scientificSkillList.add(new ScientificSkill(getId(), characterId, "Chirurgie", "Médecine", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        scientificSkillList.add(new ScientificSkill(getId(), characterId, "Diagnostic", "Médecine", "FOC", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        scientificSkillList.add(new ScientificSkill(getId(), characterId, "Soins sur animaux", "Médecine", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        scientificSkillList.add(new ScientificSkill(getId(), characterId, "Soins sur humains", "Médecine", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        scientificSkillList.add(new ScientificSkill(getId(), characterId, "Potions, onguents de soin", "Alchimie", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        return scientificSkillList;

    }
}
