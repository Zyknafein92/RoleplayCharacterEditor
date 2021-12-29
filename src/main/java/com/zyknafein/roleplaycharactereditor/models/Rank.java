package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rank {
    private RankEnum name;
    private Integer statsModifier;
    private Integer maxModifier;

    private Rank initRankValue(RankEnum name) {
        if (name == RankEnum.Civil) {
            statsModifier = 66;
            maxModifier = 4;
        } else if (name == RankEnum.LOUVETEAU) {
            statsModifier = 69;
            maxModifier = 5;
        } else if (name == RankEnum.LOUP) {
            statsModifier = 72;
            maxModifier = 6;
        } else if (name == RankEnum.LOUPAGUERRI) {
            statsModifier = 74;
            maxModifier = 6;
        } else if (name == RankEnum.LOUPVETERAN || name == RankEnum.SERGENT) {
            statsModifier = 75;
            maxModifier= 7;
        }
        return new Rank(name, statsModifier, maxModifier);
    }
}
