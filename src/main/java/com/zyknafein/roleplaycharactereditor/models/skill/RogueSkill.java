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
public class RogueSkill extends Skill {

    public RogueSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }


    public List<RogueSkill> initSkillList(Integer characterId) {
        List<RogueSkill> rogueSkillList = new ArrayList<>();

        rogueSkillList.add(new RogueSkill(getId(),characterId,"Crochetage", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Poisons & Antidotes", "Compétence d'action", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Poser/Désarmer les pièges", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Acrobatie", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Torture", "Compétence d'action", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Pickpocket", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Contrefaçon", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Furtivité", "Compétence d'action", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        rogueSkillList.add(new RogueSkill(getId(),characterId,"Duperie/Comédie/Reconnaissance de mensonges", "Compétences Sociales", "CHA", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Déguisement", "Compétences Sociales", "CHA", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        rogueSkillList.add(new RogueSkill(getId(),characterId,"Pistage", "Compétences Sociales", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        return rogueSkillList;
    }
}
