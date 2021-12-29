package com.zyknafein.roleplaycharactereditor.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Anomaly {
    String name;
    String description;
    List<Bonus> bonusList;
    List<Malus> malusList;
}