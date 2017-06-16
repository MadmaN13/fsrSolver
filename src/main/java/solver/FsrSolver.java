package solver;

import fsr.model.FunctionalSecurityRequirement;
import fsr.model.SecurityObjective;
import fsr.model.utils.ByScoreAcsPaymentComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class FsrSolver {

    private List<SecurityObjective> objectives;
    public static final int FSR_WITH_MIN_SCORE_INDEX = 0;

    public FsrSolver (List<SecurityObjective> objectives) {
        this.objectives = objectives;
    }

    public List<FunctionalSecurityRequirement> solve() {
        List<FunctionalSecurityRequirement> optimalFsrs = new ArrayList<>();
        getObjectives().forEach(obj -> {
            List<FunctionalSecurityRequirement> fsrs = obj.getFsrs();
            Collections.sort(fsrs,new ByScoreAcsPaymentComparator());
            optimalFsrs.add(fsrs.get(FSR_WITH_MIN_SCORE_INDEX));
        });
        return optimalFsrs;
    }

    // ACCESSORS
    public List<SecurityObjective> getObjectives() {
        return objectives;
    }
    public void setObjectives(List<SecurityObjective> objectives) {
        this.objectives = objectives;
    }

}
