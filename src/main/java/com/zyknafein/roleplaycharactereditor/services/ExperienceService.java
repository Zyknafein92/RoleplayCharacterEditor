package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.ErrorCode;
import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Age;
import com.zyknafein.roleplaycharactereditor.models.Experience;
import com.zyknafein.roleplaycharactereditor.models.Rank;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    /**
     * Initialize all modifiers for the character from his rank and his age
     * @param characterRank Rank of the character
     * @param characterAge  Age of the character
     * @return new experience with correct value.
     */
    public Experience initExperience(Rank characterRank, Age characterAge) {
        if(characterAge == null || characterRank == null) {
            throw new InvalidDataException("Les données fournies sont invalides ou null", ErrorCode.EXPERIENCE_CREATION_ERROR);
        }
        return Experience.builder()
                .xpAvailable(200 + characterAge.getXpModifier() + characterRank.getXpModifier())
                .xpAnimationGain(0)
                .xpSpent(0)
                .xpLeft(200 + characterAge.getXpModifier() + characterRank.getXpModifier())
                .xpTotal(200 + characterAge.getXpModifier() + characterRank.getXpModifier())
                .build();
    }
}
