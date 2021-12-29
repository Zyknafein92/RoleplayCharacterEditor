package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExperienceDTO {
    Integer xpAvailable;
    Integer xpLeft;
    Integer xpAnimationGain;
    Integer xpSpent;
    Integer xpTotal;
}
