package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Age;
import com.zyknafein.roleplaycharactereditor.models.Experience;
import com.zyknafein.roleplaycharactereditor.models.Rank;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ExperienceServiceTest {

    AgeService ageService = new AgeService();
    RankService rankService = new RankService();
    ExperienceService experienceService = new ExperienceService();

    @Test
    void test_initExperience_GivenGoodValue_ReturnValue() {
        Age characterAge = ageService.initAgeModifier(18);
        Rank characterRank = rankService.initRankValue("Louveteau");
        Experience characterExperience = experienceService.initExperience(characterRank, characterAge);

        assertEquals(characterExperience.getXpAvailable(), 200);
        assertEquals(characterExperience.getXpAnimationGain(), 0);
        assertEquals(characterExperience.getXpSpent(),0);
        assertEquals(characterExperience.getXpTotal(),200);
    }

    @Test
    void test_initExperience_GivenNullValue_ReturnInvalidDataException() {
        Age characterAge = ageService.initAgeModifier(18);

        InvalidDataException invalidDataException = assertThrows(InvalidDataException.class,
                () -> experienceService.initExperience(null, characterAge));

        assertEquals("Les données fournies sont invalides ou null", invalidDataException.getMessage());

        Rank characterRank = rankService.initRankValue("Louveteau");
         invalidDataException = assertThrows(InvalidDataException.class,
                () -> experienceService.initExperience(characterRank, null));

        invalidDataException = assertThrows(InvalidDataException.class,
                () -> experienceService.initExperience(null, null));
    }
}
