package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private RankEnum name;
    private Integer statsModifier;
    private Integer maxModifier;

    public Rank(RankEnum name, Integer statsModifier, Integer maxModifier) {
        this.name = name;
        this.statsModifier = statsModifier;
        this.maxModifier = maxModifier;
    }

    private Rank initRankValue(RankEnum name) {
        if (name == RankEnum.CIVIL) {
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
