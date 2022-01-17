package com.zyknafein.roleplaycharactereditor.services;

import com.zyknafein.roleplaycharactereditor.models.Age;
import com.zyknafein.roleplaycharactereditor.models.Rank;
import com.zyknafein.roleplaycharactereditor.models.StatsPoint;
import com.zyknafein.roleplaycharactereditor.repository.StatsPointRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StatsPointService {

    private final StatsPointRepository statsPointRepository;

    /**
     *
     * @param characterRank
     * @return
     */
    public List<StatsPoint> initStatsPoint(Rank characterRank) {
        List<StatsPoint> statsPointList = new ArrayList<>();
        statsPointList.add(new StatsPoint("Force",0,0,0));
        statsPointList.add( new StatsPoint("Dexterité",0,0,0));
        statsPointList.add( new StatsPoint("Constitution",0,0,0));
        statsPointList.add( new StatsPoint("Sagesse",0,0,0));
        statsPointList.add( new StatsPoint("Charisme",0,0,0));
        statsPointList.forEach(e -> e.setMaxModifier(characterRank.getMaxModifier()));
        return statsPointList;
    }
}
