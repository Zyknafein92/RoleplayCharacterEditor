package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.enums.JobEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JobDTO {
    private JobEnum name;
    private Integer skillModifier;
    private String classModifier;
}
