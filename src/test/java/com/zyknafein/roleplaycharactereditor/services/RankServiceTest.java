package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.exceptions.InvalidDataException;
import com.zyknafein.roleplaycharactereditor.models.Rank;
import com.zyknafein.roleplaycharactereditor.models.enums.RankEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class RankServiceTest {
//    RankService rankService = new RankService();
//
//    @Test
//    void test_InitRankValue_GiveNull_ReturnException() {
//        InvalidDataException invalidDataException = assertThrows(InvalidDataException.class,
//                () -> rankService.initRankValue(null));
//        assertEquals("Le rang ne peut pas être null", invalidDataException.getMessage());
//    }
//
//    @Test
//    void test_InitRankValue_GiveBadValue_ReturnException() {
//        InvalidDataException invalidDataException = assertThrows(InvalidDataException.class,
//                () -> rankService.initRankValue("test"));
//        assertEquals("Le rang n'est pas reconnu", invalidDataException.getMessage());
//    }
//
//    @Test
//    void test_InitRankValue_GiveGoodValue_ReturnValue() {
//        String rankEnum = "Civil";
//        Rank rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 66);
//        assertEquals(rank.getMaxModifier(), 4);
//
//        rankEnum = "Louveteau";
//        rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 69);
//        assertEquals(rank.getMaxModifier(), 5);
//
//        rankEnum = "Loup";
//        rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 72);
//        assertEquals(rank.getMaxModifier(), 6);
//
//        rankEnum = "Loup aguerri";
//        rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 74);
//        assertEquals(rank.getMaxModifier(), 6);
//
//        rankEnum = "Loup veteran";
//        rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 74);
//        assertEquals(rank.getMaxModifier(), 6);
//
//        rankEnum = "Sergent";
//        rank = rankService.initRankValue(rankEnum);
//        assertEquals(rank.getStatsModifier(), 75);
//        assertEquals(rank.getMaxModifier(), 7);
//    }
//}
