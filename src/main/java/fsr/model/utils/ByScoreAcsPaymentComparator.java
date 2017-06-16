package fsr.model.utils;

import fsr.model.FunctionalSecurityRequirement;

import java.util.Comparator;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class ByScoreAcsPaymentComparator implements Comparator<FunctionalSecurityRequirement> {

    @Override
    public int compare(FunctionalSecurityRequirement o1, FunctionalSecurityRequirement o2) {
        return o1.getScore() - o2.getScore();
    }
}