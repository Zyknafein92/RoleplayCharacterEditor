package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asset {
    String name;
    String description;
    List<Bonus> bonusList;
}
