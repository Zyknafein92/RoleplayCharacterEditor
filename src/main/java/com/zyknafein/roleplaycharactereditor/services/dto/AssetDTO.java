package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AssetDTO {
    String name;
    String description;
    List<Bonus> bonusList;
}
