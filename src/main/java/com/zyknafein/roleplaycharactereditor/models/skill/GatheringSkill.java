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
public class GatheringSkill extends Skill {

    public GatheringSkill(Integer id, Integer characterId, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, List<Bonus> bonusList, List<Malus> malusList) {
        super(id, characterId, name, type, statName, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber, bonusList, malusList);
    }


    public List<GatheringSkill> initSkillList(Integer characterId) {
        List<GatheringSkill> gatheringListSkill = new ArrayList<>();
        gatheringListSkill.add(new GatheringSkill(getId(), characterId, "Botaniste : Récolte de plantes", "Récolte", "FOC", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        gatheringListSkill.add(new GatheringSkill(getId(), characterId, "Mineur : Récolte de minerais", "Récolte", "FOC", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        gatheringListSkill.add(new GatheringSkill(getId(), characterId, "Arboriculteur : Récolte de bois", "Récolte", "FOC", 0, 0, 0, 0, 0, 0, new ArrayList<>(), new ArrayList<>()));
        return gatheringListSkill;
    }
}
