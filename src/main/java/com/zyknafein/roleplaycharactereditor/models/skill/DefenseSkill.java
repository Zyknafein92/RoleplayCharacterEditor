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
public class DefenseSkill extends Skill {

    public DefenseSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<DefenseSkill> initSkillList(Integer characterId) {
        List<DefenseSkill> defenseListSkill = new ArrayList<>();
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Moyenne", "Armures", "CON", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Lourde", "Armures", "CON", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Esquive", "Autres", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Parade", "Autres", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Blocage", "Autres", "CON", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        defenseListSkill.add(new DefenseSkill(getId(), characterId, "Résistance à la douleur", "Autres", "CON", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        return defenseListSkill;
    }
}
