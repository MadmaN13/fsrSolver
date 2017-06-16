package fsr.model;

import java.util.Comparator;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class FunctionalSecurityRequirement {
    private String name;
    private int score;

    public FunctionalSecurityRequirement(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(this.getClass().getName())
                .append(" = {")
                .append(" name = ").append(getName()).append(";")
                .append(" score = ").append(getScore())
                .append(" }").toString();
    }

    // ACCESSORS
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}


