package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Anomaly {
    String name;
    String description;
    List<Bonus> bonusList;
    List<Malus> malusList;
}
