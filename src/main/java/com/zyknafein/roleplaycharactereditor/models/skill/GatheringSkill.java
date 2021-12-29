package com.zyknafein.roleplaycharactereditor.models.skill;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GatheringSkill extends Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public GatheringSkill(String name, String type, String statName, List<Bonus> bonusList, List<Malus> malusList, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, Integer id) {
        super(name, type, statName, bonusList, malusList, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber);
        this.id = id;
    }

    @Override
    public void initSkill() {

    }
}
