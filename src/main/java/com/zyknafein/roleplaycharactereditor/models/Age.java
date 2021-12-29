package com.zyknafein.roleplaycharactereditor.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Age {
    Integer characterOld;
    Integer statsModifier;
    Integer xpModifier;

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
