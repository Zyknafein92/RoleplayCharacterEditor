package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.models.Rank;
import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import com.zyknafein.roleplaycharactereditor.repository.RankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RankService {
    private final RankRepository rankRepository;
    /**
     * Initialize all modifiers for the character from his rank
     * @param name Enum value
     * @return rank
     */
    public Rank findRankByName(RankEnum name) {
        return rankRepository.findRankByName(name);
    }
}
