package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.enums.JobEnum;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {
    private JobEnum name;
    private Integer skillModifier = 1;
    private String classModifier;


    private Job initJobModifier(JobEnum name) {
        if(name == JobEnum.SOLDAT ) {
           classModifier = "Soldier";
        } else if (name == JobEnum.CHASSEUR) {
            classModifier = "Hunter";
        } else if (name == JobEnum.ASSASSIN) {
            classModifier= "RogueSkill";
        } else if (name == JobEnum.MAGE) {
            classModifier = "MagicSkill";
        } else if (name == JobEnum.SCIENTIFIQUE) {
            classModifier = "ScientificSkill";
        } else if (name == JobEnum.ARTISAN) {
            classModifier = "ArtisanalSkill";
        }
        return new Job(name,skillModifier,classModifier);
    }
}
