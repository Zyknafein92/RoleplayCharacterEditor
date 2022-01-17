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
public class Modifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer value;
    private Integer maxModifier;

    public Modifier(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public Modifier(String name, Integer value, Integer maxModifier) {
        this.name = name;
        this.value = value;
        this.maxModifier = maxModifier;
    }
}
