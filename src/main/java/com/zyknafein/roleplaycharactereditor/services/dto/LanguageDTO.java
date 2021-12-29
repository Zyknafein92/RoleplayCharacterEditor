package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LanguageDTO {
    private String name;
    private Integer value;
}
