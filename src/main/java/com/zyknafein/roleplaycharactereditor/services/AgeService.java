package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.ErrorCode;
import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Age;
import org.springframework.stereotype.Service;

@Service
public class AgeService {

    /**
     *  Initialize all modifiers for the character with his age
     * @param characterOld Age of the character
     * @return Age
     */
    public Age initAgeModifier(Integer characterOld) {
        Age age = new Age();
        age.setCharacterAge(characterOld);
        if(characterOld == null) throw new InvalidDataException("l'âge ne peut pas être null", ErrorCode.AGE_CREATION_ERROR);
        if(characterOld >= 8 && characterOld <= 12) {
            age.setStatsModifier(-15);
            age.setXpModifier(-60);
        } else if(characterOld >= 13 && characterOld <= 16) {
            age.setStatsModifier(-6);
            age.setXpModifier(-40);
        } else if(characterOld >= 17 && characterOld <= 19) {
            age.setStatsModifier(0);
            age.setXpModifier(-20);
        } else if(characterOld >= 20 && characterOld <= 39) {
            age.setStatsModifier(0);
            age.setXpModifier(0);
        } else if(characterOld >= 40 && characterOld <= 49) {
            age.setStatsModifier(-6);
            age.setXpModifier(20);
        } else if(characterOld >= 50 && characterOld <= 55) {
            age.setStatsModifier(-6);
            age.setXpModifier(40);
        } else throw new InvalidDataException("L'âge saisie est invalide, il doit être compris entre 8 et 55 ans", ErrorCode.AGE_CREATION_ERROR);

        return age;
    }
}
