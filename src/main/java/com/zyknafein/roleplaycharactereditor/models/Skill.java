package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Skill {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String skillType;
       private String name;
       private String type;
       private String statName;
       private Integer masteryRank; // nbre de pts bonus par rapport au rang
       private Integer masteryJob; // nbre de pts que tu as via le job
       private Integer masteryPoint; // nbe pts investies dans la compétence
       private Integer masteryBonus; // nbre bonus total.
       private Integer rollBonus; // pts a a ajouter au rand final
       private Integer diceNumber;

       public Skill(String skillType, String name, String type, String statName, Integer masteryRank, Integer masteryJob, Integer masteryPoint, Integer masteryBonus, Integer rollBonus, Integer diceNumber) {
              this.skillType = skillType;
              this.name = name;
              this.type = type;
              this.statName = statName;
              this.masteryRank = masteryRank;
              this.masteryJob = masteryJob;
              this.masteryPoint = masteryPoint;
              this.masteryBonus = masteryBonus;
              this.rollBonus = rollBonus;
              this.diceNumber = diceNumber;
       }
}


