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
public class MagicSkill extends Skill {
    public MagicSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<MagicSkill> initSkillList(Integer characterId) {
        List<MagicSkill> magicskillList = new ArrayList<>();
        magicskillList.add(new MagicSkill(getId(), characterId, "Mage de feu", "Magie de Feu", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Pyromancien", "Magie de Feu", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Feu", "Magie de Feu", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        magicskillList.add(new MagicSkill(getId(), characterId, "Maitrise des soins", "Magie de Soin", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Maitrise de la protection", "Magie de Soin", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Soins", "Magie de Soin", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        magicskillList.add(new MagicSkill(getId(), characterId, "Tempête de glace", "Magie de Glace", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Batisseur de glace", "Magie de Glace", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Glace", "Magie de Glace", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        magicskillList.add(new MagicSkill(getId(), characterId, "Annihilation", "Magie du Néant", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Décrépitude", "Magie du Néant", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Néant", "Magie du Néant", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        magicskillList.add(new MagicSkill(getId(), characterId, "Druidisme", "Magie de la Nature", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Spores", "Magie de la Nature", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Nature", "Magie de la Nature", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        magicskillList.add(new MagicSkill(getId(), characterId, "Illusions & Esprit", "Magie académique", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Contre-Magie", "Magie académique", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        magicskillList.add(new MagicSkill(getId(), characterId, "Divers Académique", "Magie académique", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        return magicskillList;
    }
}
