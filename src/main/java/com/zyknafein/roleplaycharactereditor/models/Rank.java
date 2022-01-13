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
    private Long id;
    private RankEnum name;
    private Integer xpModifier;
    private Integer statsModifier;
    private Integer maxModifier;

    public Rank(RankEnum name, Integer statsModifier, Integer maxModifier) {
        this.name = name;
        this.statsModifier = statsModifier;
        this.maxModifier = maxModifier;
    }
}
