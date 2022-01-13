package com.zyknafein.roleplaycharactereditor.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class RoleplayCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private List<StatsPoint> statsPoint = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Asset> assetList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Anomaly> anomalyList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Skill> skillList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Language> languageList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Knowledge> knowledgeList = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Modifier> modifierList = new ArrayList<>();

}
