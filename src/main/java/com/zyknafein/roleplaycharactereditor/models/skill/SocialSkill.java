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
public class SocialSkill extends Skill {
    public SocialSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }


    public List<SocialSkill> initSkillList(Integer characterId) {
        List<SocialSkill> socialSkillList = new ArrayList<>();

        socialSkillList.add(new SocialSkill(getId(), characterId, "Séduction", "Social", "CHA", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Leadership", "Social", "CHA", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Intimidation", "Social", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Analyse comportementale", "Social", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Etiquette", "Social", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Eloquence", "Social", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Négociation", "Social", "CHA", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Sexe", "Social", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Volonté", "Social", "FOC", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        socialSkillList.add(new SocialSkill(getId(), characterId, "Equitation", "Transport", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Escalade", "Transport", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Natation", "Transport", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        socialSkillList.add(new SocialSkill(getId(), characterId, "Navigation", "Transport", "FOC", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        return socialSkillList;
    }
}
