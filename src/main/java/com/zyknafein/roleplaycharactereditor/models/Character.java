package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.skill.Skill;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Character {
    String fullName;
    String nickName;
    Age age;
    Rank rank;
    Job job;
    Experience experience;
    StatsPoint statsPoint;
    List<Asset> assetList;
    List<Anomaly> anomalies;
    List<Skill> skillsList;
    List<Language> languageList;
    List<Knowledge> knowledgeList;
}
