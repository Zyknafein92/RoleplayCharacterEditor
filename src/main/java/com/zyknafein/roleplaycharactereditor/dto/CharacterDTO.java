package com.zyknafein.roleplaycharactereditor.dto;

import com.zyknafein.roleplaycharactereditor.models.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CharacterDTO {
    private String fullName;
    private String nickName;
    private Integer age;
    private String rank;
    private Job job;
//    private Experience experience;
//    private List<StatsPoint> statsPoint;
//    private List<Asset> assetList;
//    private List<Anomaly> anomalyList;
//    private List<Skill> skillList;
//    private List<Language> languageList;
//    private List<Knowledge> knowledgeList;
//    private List<Modifier> modifierList;
}
