package com.zyknafein.roleplaycharactereditor.models;

import com.zyknafein.roleplaycharactereditor.models.skill.ArtisanalSkill;
import com.zyknafein.roleplaycharactereditor.models.skill.MeleeSkill;
import com.zyknafein.roleplaycharactereditor.models.skill.Skill;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String nickName;

    @OneToOne(cascade = CascadeType.ALL)
    private Age age;

    @OneToOne(cascade = CascadeType.ALL)
    private Rank rank;

    @OneToOne(cascade = CascadeType.ALL)
    private Job job;

    @OneToOne(cascade = CascadeType.ALL)
    private Experience experience;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<StatsPoint> statsPoint;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Asset> assetList;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Anomaly> anomalyList;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<MeleeSkill> meleeSkillList;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Language> languageList;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Knowledge> knowledgeList;
}
