package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Age;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AgeServiceTest {
    AgeService ageService = new AgeService();


//    @BeforeAll
//    void init() {
//
//    }

    @Test
    void testAgeInit_GivenBadValue_ReturnException() {
        InvalidDataException invalidDataException = assertThrows(InvalidDataException.class,
                () -> ageService.initAgeModifier(0));

        assertEquals("L'âge saisie est invalide, il doit être compris entre 8 et 55 ans", invalidDataException.getMessage());
    }

    @Test
    void test_AgeInit_GiveNull_ReturnException() {
        InvalidDataException invalidDataException = assertThrows(InvalidDataException.class,
                () -> ageService.initAgeModifier(null));

        assertEquals("l'âge ne peut pas être null", invalidDataException.getMessage());
    }

    @Test
    void testAgeInit_GiveGoodValue_ReturnGoodValue() {
        Age characterAge = ageService.initAgeModifier(10);
        assertEquals(characterAge.getStatsModifier(), -15);
        assertEquals(characterAge.getXpModifier(), -60);

        characterAge = ageService.initAgeModifier(15);
        assertEquals(characterAge.getStatsModifier(), -6);
        assertEquals(characterAge.getXpModifier(), -40);

        characterAge = ageService.initAgeModifier(18);
        assertEquals(characterAge.getStatsModifier(), 0);
        assertEquals(characterAge.getXpModifier(), -20);

        characterAge = ageService.initAgeModifier(25);
        assertEquals(characterAge.getStatsModifier(), 0);
        assertEquals(characterAge.getXpModifier(), 0);

        characterAge = ageService.initAgeModifier(45);
        assertEquals(characterAge.getStatsModifier(), -6);
        assertEquals(characterAge.getXpModifier(), 20);

        characterAge = ageService.initAgeModifier(55);
        assertEquals(characterAge.getStatsModifier(), -6);
        assertEquals(characterAge.getXpModifier(), 40);

    }
}
