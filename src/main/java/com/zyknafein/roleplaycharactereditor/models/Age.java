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
    private Integer characterAge;
    private Integer statsModifier;
    private Integer xpModifier;

    public Age(Integer characterAge, Integer statsModifier, Integer xpModifier) {
        this.characterAge = characterAge;
        this.statsModifier = statsModifier;
        this.xpModifier = xpModifier;
    }
}
