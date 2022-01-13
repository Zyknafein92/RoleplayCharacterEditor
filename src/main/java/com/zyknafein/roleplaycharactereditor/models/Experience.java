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
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer xpAvailable;

    private Integer xpLeft;

    private Integer xpAnimationGain;

    private Integer xpSpent;

    private Integer xpTotal;

    public Experience(Integer xpAvailable, Integer xpLeft, Integer xpAnimationGain, Integer xpSpent, Integer xpTotal) {
        this.xpAvailable = xpAvailable;
        this.xpLeft = xpLeft;
        this.xpAnimationGain = xpAnimationGain;
        this.xpSpent = xpSpent;
        this.xpTotal = xpTotal;
    }
}
