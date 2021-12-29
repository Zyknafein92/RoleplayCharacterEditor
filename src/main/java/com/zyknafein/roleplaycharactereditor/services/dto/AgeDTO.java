package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AgeDTO {
    Integer characterOld;
    Integer statsModifier;
    Integer xpModifier;
}
