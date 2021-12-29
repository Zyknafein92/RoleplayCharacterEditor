package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

@Data
@NoArgsConstructor
@Builder
public class Experience {
    Integer xpAvailable;
    Integer xpLeft;
    Integer xpAnimationGain;
    Integer xpSpent;
    Integer xpTotal;
}
