package com.zyknafein.roleplaycharactereditor.models.skill;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Skill {
       private String name;
       private String type;
       private String statName;
       private List<Bonus> bonusList;
       private List<Malus> malusList;
       private Integer masteryRank;
       private Integer masteryJob;
       private Integer masteryPoint;
       private Integer masteryBonus;
       private Integer rollBonus;
       private Integer diceNumber;

       public abstract void initSkill();
}
