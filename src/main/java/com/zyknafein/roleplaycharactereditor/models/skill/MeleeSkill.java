package com.zyknafein.roleplaycharactereditor.models.skill;


import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@Entity
public class MeleeSkill extends Skill {

    public MeleeSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }

    public List<MeleeSkill> initSkillList(Integer characterId) {
        List<MeleeSkill> meleeSkillList = new ArrayList<>();
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Percussion", "Corps à corps", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Lutte", "Corps à corps", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Lame courte (Poignard, dagues, stylet...)", "Armes légères(1 main)", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Lame (Epée, Sabre…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Lame (Rapière…)", "Armes légères(1 main)", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Tranchante (Hache, hachoir…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Contondante (Masse, massue, matraque, gourdin…)", "Armes légères(1 main)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Epées (Espadon, bâtarde…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Hache (Bardiche….)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Contondantes (Marteau de Lucerne, tetsubo….)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Hast (Vouge, hallebarde…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));
        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Lances longues (Sarisse, pique, lance…)", "Armes lourdes (2 mains)", "FOR", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        meleeSkillList.add(new MeleeSkill(getId(), characterId, "Arme improvisée (Chaise, Tesson de bouteille…)", "Exotique", "DEX", 0,0,0,0,0,0, new ArrayList<>(), new ArrayList<>()));

        return meleeSkillList;
    }
}
