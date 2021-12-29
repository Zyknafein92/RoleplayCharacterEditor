package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Asset {
    String name;
    String description;
    List<Bonus> bonusList;
}
