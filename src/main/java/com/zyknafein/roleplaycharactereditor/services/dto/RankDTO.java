package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RankDTO {
    private RankEnum name;
    private Integer statsModifier;
    private Integer maxModifier;
}
