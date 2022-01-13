package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.ErrorCode;
import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Rank;
import org.springframework.stereotype.Service;

@Service
public class RankService {
    /**
     * Initialize all modifiers for the character from his rank
     * @param name Enum value
     * @return rank
     */
    public Rank initRankValue(String name) {
        Rank rank = new Rank();

        if(name == null) throw new InvalidDataException("Le rang ne peut pas être null", ErrorCode.RANK_CREATION_ERROR);

        if (name.equals("Civil")) {
            rank.setXpModifier(0);
            rank.setStatsModifier(66);
            rank.setMaxModifier(4);
        } else if (name.equals("Louveteau")) {
            rank.setXpModifier(20);
            rank.setStatsModifier(69);
            rank.setMaxModifier(5);
        } else if (name.equals("Loup")) {
            rank.setXpModifier(35);
            rank.setStatsModifier(72);
            rank.setMaxModifier(6);
        } else if (name.equals("Loup aguerri")) {
            rank.setXpModifier(50);
            rank.setStatsModifier(74);
            rank.setMaxModifier(6);
        } else if (name.equals("Loup veteran")) {
            rank.setXpModifier(60);
            rank.setStatsModifier(74);
            rank.setMaxModifier(6);
        }else if(name.equals("Sergent")) {
            rank.setXpModifier(75);
            rank.setStatsModifier(75);
            rank.setMaxModifier(7);
        } else throw new InvalidDataException("Le rang n'est pas reconnu", ErrorCode.RANK_CREATION_ERROR);

        return rank;
    }
}
