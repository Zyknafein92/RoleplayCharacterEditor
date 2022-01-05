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
public class DistantSkill extends Skill {

    public DistantSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<DistantSkill> initSkillList(Integer characterId) {
        List<DistantSkill> distantSkillList = new ArrayList<>();
        distantSkillList.add(new DistantSkill(getId(),characterId,"Armes blanches (Dague, hachette…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme à feu (Pistolet…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme à traction (Arc court…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme à rotation (Fronde…)", "Armes légères", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme à feu (Mousquet…)", "Armes lourdes", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme à traction (Arc long…)", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Armes blanches (Lance, javelot…)", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Canons, Baliste, etc….", "Armes lourdes", "FOR", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        distantSkillList.add(new DistantSkill(getId(),characterId,"Arme improvisée à lancer (Caillou, parapluie…)", "Exotique", "DEX", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        return distantSkillList;
    }
}
