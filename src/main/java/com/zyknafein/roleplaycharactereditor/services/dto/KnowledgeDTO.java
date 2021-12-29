package com.zyknafein.roleplaycharactereditor.services.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KnowledgeDTO {
    String name;
    Integer value;
}
