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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MeleeSkill extends Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public MeleeSkill(String name, String type, String statName, List<Bonus> bonusList, List<Malus> malusList, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber, Integer id) {
        super(name, type, statName, bonusList, malusList, masteryRank, masteryJob, masteryPoint, masteryBonus, rollBonus, diceNumber);
        this.id = id;
    }

    @Override
    public void initSkill() {

    }
}
