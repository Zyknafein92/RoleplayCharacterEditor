package com.zyknafein.roleplaycharactereditor.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Experience {
    Integer xpAvailable;
    Integer xpLeft;
    Integer xpAnimationGain;
    Integer xpSpent;
    Integer xpTotal;
}
