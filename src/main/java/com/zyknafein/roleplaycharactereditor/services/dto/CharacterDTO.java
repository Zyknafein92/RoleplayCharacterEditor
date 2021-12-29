package com.zyknafein.roleplaycharactereditor.services.dto;

import com.zyknafein.roleplaycharactereditor.models.*;
import com.zyknafein.roleplaycharactereditor.models.skill.Skill;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CharacterDTO {
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
