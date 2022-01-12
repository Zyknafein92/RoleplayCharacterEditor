package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Age {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer characterOld;
    private Integer statsModifier;
    private Integer xpModifier;

    public Age(Integer characterOld, Integer statsModifier, Integer xpModifier) {
        this.characterOld = characterOld;
        this.statsModifier = statsModifier;
        this.xpModifier = xpModifier;
    }

    public Age initModifier(Integer characterOld) {
        if(characterOld >= 8 && characterOld <= 12) {
            statsModifier = -15;
            xpModifier = -60;
        } else if(characterOld >= 13 && characterOld <= 16) {
            statsModifier = -6;
            xpModifier = -40;
        } else if(characterOld >= 17 && characterOld <= 19) {
            statsModifier = 0;
            xpModifier = -20;
        } else if(characterOld >= 20 && characterOld <= 39) {
            statsModifier = 0;
            xpModifier = 0;
        } else if(characterOld >= 40 && characterOld <= 49) {
            statsModifier = -6;
            xpModifier = 20;
        } else if(characterOld >= 50 && characterOld <= 55) {
            statsModifier = -6;
            xpModifier = 40;
        }
        return new Age(characterOld,statsModifier,xpModifier);
    }

}
