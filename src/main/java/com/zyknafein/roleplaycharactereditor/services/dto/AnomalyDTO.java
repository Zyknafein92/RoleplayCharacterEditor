package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.Bonus;
import com.zyknafein.roleplaycharactereditor.models.Malus;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AnomalyDTO {
    String name;
    String description;
    List<Bonus> bonusList;
    List<Malus> malusList;
}
