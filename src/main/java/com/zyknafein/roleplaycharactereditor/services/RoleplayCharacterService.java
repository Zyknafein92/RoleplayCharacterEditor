package com.zyknafein.roleplaycharactereditor.services;


import com.zyknafein.roleplaycharactereditor.dto.CharacterDTO;
import com.zyknafein.roleplaycharactereditor.models.*;
import com.zyknafein.roleplaycharactereditor.repository.RoleplayCharacterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class RoleplayCharacterService {

    private final RoleplayCharacterRepository roleplayCharacterRepository;
    private final AgeService ageService;
    private final RankService rankService;
    private final ExperienceService experienceService;
    private final StatsPointService statsPointService;

    public RoleplayCharacter getCharacter(Long id) {
        return null;
    }

    public RoleplayCharacter addCharacter(CharacterDTO characterDTO) {
        Age characterAge = ageService.initAgeModifier(characterDTO.getAge());
        Rank characterRank = rankService.initRankValue(characterDTO.getRank());
        Experience characterExperience = experienceService.initExperience(characterRank, characterAge);
        List<StatsPoint> characterStatsPoints = statsPointService.initStatsPoint(characterRank);

        RoleplayCharacter characterToSave = RoleplayCharacter.builder()
                .fullName(characterDTO.getFullName())
                .nickName(characterDTO.getNickName())
                .age(characterAge)
                .rank(characterRank)
                .job(characterDTO.getJob())
                .experience(characterExperience)
                .statsPoint(characterStatsPoints)
                .assetList(new ArrayList<>())
                .anomalyList(new ArrayList<>())
                .skillList(new ArrayList<>())
                .languageList(new ArrayList<>())
                .knowledgeList(new ArrayList<>())
                .modifierList(new ArrayList<>())
                .build();

        return roleplayCharacterRepository.save(characterToSave);
    }

    public RoleplayCharacter updateCharacter(CharacterDTO characterDTO) {
        return null;
    }

    public Long deleteCharacter(Long id) {
        return null;
    }

    /*
     Utils Methods
     */


}
