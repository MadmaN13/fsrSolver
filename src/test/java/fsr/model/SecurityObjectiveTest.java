package fsr.model;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class SecurityObjectiveTest {

    private final static Logger logger = LoggerFactory.getLogger(SecurityObjectiveTest.class);

    public static SecurityObjective objective;

    @BeforeClass
    public static void init() {
        List<FunctionalSecurityRequirement> fsrs = new ArrayList<>();
        fsrs.add(new FunctionalSecurityRequirement("Fsr 1", 5));
        fsrs.add(new FunctionalSecurityRequirement("Fsr 2", 10));
        objective = new SecurityObjective("Test objective", fsrs);
    }

    @Test
    public void toStringTest() throws Exception {
        logger.info(objective.toString());
    }

}