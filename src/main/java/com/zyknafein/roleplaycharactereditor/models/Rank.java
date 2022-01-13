package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RankEnum name;
    private Integer xpModifier;
    private Integer statsModifier;
    private Integer maxModifier;

    public Rank(RankEnum name, Integer xpModifier, Integer statsModifier, Integer maxModifier) {
        this.name = name;
        this.xpModifier = xpModifier;
        this.statsModifier = statsModifier;
        this.maxModifier = maxModifier;
    }
}
