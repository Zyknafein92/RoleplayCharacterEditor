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
public class ArtisanalSkill extends Skill {

    public ArtisanalSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<ArtisanalSkill> initSkillList(Integer characterID) {
        List<ArtisanalSkill> artisanalSkillList = new ArrayList<>();
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication d'armes à base de bois", "Travail du bois", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Menuiserie", "Travail du bois", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication d'armes à feu", "Ingénerie", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication d'armes de siège", "Ingénerie", "FOR", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Explosifs", "Ingénerie", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Munitions", "Ingénerie", "INT", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Outillage divers", "Ingénerie", "FOC", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrications d'armes à base de métal (Epée, Lance…)", "Forge", "FOR", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrications de matériel de défense (Bouclier…)", "Forge", "FOR", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication d'armures", "Forge", "FOR", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Outillage divers", "Forge", "FOR", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));

        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication d'armures", "Travail du cuir", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Fabrication de vêtements", "Travail du cuir", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        artisanalSkillList.add(new ArtisanalSkill(getId(),characterID,"Equipement divers (Sacs, baudriers, etc…)", "Travail du cuir", "DEX", 0,0,0,0,0,0,new ArrayList<>(), new ArrayList<>()));
        return artisanalSkillList;
    }
}
