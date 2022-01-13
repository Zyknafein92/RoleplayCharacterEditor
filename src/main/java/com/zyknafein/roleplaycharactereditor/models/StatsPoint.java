package com.zyknafein.roleplaycharactereditor.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class StatsPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer value;
    private Integer modifier;
    private Integer maxModifier;

    public StatsPoint(String name, Integer value, Integer modifier, Integer maxModifier) {
        this.name = name;
        this.value = value;
        this.modifier = modifier;
        this.maxModifier = maxModifier;
    }
}
