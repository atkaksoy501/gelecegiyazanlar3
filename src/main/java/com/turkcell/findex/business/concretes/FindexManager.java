package com.turkcell.findex.business.concretes;

import com.turkcell.findex.business.abstracts.FindexService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FindexManager implements FindexService {
    @Override
    public int getFindexScore(String nationalId) {
        Random random = new Random();
        int minScore = 1200;
        int maxScore = 1800;
        return random.nextInt(maxScore - minScore) + minScore;
    }
}
