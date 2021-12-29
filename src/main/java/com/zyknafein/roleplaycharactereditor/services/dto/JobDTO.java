package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobDTO {
    private String name;
    private Integer skillModifier;
    private String classModifier;
}
