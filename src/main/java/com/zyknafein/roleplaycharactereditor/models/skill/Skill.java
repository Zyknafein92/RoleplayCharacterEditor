package com.zyknafein.roleplaycharactereditor.models.skill;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Skill {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Integer id;
       private Integer characterId;
       private String name;
       private String type;
       private String statName;
       private Integer masteryRank;
       private Integer masteryJob;
       private Integer masteryPoint;
       private Integer masteryBonus;
       private Integer rollBonus;
       private Integer diceNumber;

       @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
       private List<Bonus> bonusList;
       @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
       private List<Malus> malusList;

}
