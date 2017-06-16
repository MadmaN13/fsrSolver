package fsr.model;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 16.06.2017.
 */
public class FunctionalSecurityRequirementTest {

    private final static Logger logger = LoggerFactory.getLogger(FunctionalSecurityRequirementTest.class);

    private static FunctionalSecurityRequirement frs;

    @BeforeClass
    public static void init() {
        frs = new FunctionalSecurityRequirement("Test fsr", 5);
    }

    @Test
    public void toStringTest() throws Exception {
        logger.info(frs.toString());
    }

}