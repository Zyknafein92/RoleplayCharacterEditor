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
public class ArtisticSkill extends Skill {

    public ArtisticSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<ArtisticSkill> initSkillList(Integer characterID) {
        List<ArtisticSkill> artisticSkillList = new ArrayList<>();
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Répertoire musical", "Troubadour", "FOC", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Chant", "Troubadour", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Musicien", "Troubadour", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Danse", "Troubadour", "CON", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Poésie", "Troubadour", "INT", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Peinture / Dessin", "Artiste", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Equilibriste", "Artiste", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Jonglage", "Artiste", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Broderie", "Artiste", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        artisticSkillList.add(new ArtisticSkill(getId(),characterID,"Sculpture", "Artiste", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        return artisticSkillList;
    }
}
