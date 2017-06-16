package solver;

import fsr.model.FunctionalSecurityRequirement;
import fsr.model.SecurityObjective;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class FsrSolverTest {

    private final static Logger logger = LoggerFactory.getLogger(FsrSolverTest.class);
    private static List<SecurityObjective> objectives;

    @BeforeClass
    public static void init() {
        objectives = new ArrayList<>();

        List<FunctionalSecurityRequirement> fsrs1 = new ArrayList<>();
        fsrs1.add(new FunctionalSecurityRequirement("Fsr 2", 7));
        fsrs1.add(new FunctionalSecurityRequirement("Fsr 2", 10));
        fsrs1.add(new FunctionalSecurityRequirement("Fsr 1", 5));
        objectives.add(new SecurityObjective("Test objective 1", fsrs1));

        List<FunctionalSecurityRequirement> fsrs2 = new ArrayList<>();
        fsrs2.add(new FunctionalSecurityRequirement("Fsr 3", 20));
        fsrs2.add(new FunctionalSecurityRequirement("Fsr 4", 15));
        fsrs2.add(new FunctionalSecurityRequirement("Fsr 5", 23));
        objectives.add(new SecurityObjective("Test objective 2", fsrs2));
    }

    @Test
    public void solve() throws Exception {
        logger.info("Input objectives:");
        objectives.forEach(obj -> logger.info(obj.toString()));
        FsrSolver solver = new FsrSolver(objectives);
        List<FunctionalSecurityRequirement> optimalFsrs = solver.solve();
        logger.info("Optimal requirements:");
        optimalFsrs.forEach(of -> logger.info(of.toString()));
    }

}