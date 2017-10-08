package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class DescribePublicApiCheckRelaxedCCDocuTest {

    @Test
    public void docuOnClassOnly() {
        JavaCheckVerifier.verifyNoIssue("src/test/files/DescribePublicApiCheck2a.java", new DescribePublicApiCheck());
    }

    @Test
    public void docuOnCtorOnly() {
        JavaCheckVerifier.verifyNoIssue("src/test/files/DescribePublicApiCheck2b.java", new DescribePublicApiCheck());
    }

    @Test
    public void docuMissingOnBoth() {
        JavaCheckVerifier.verify("src/test/files/DescribePublicApiCheckMissing.java", new DescribePublicApiCheck());
    }

    @Test
    public void twoCtorsEnforceDocu() {
        JavaCheckVerifier.verify("src/test/files/DescribePublicApiCheckTwoCtors.java", new DescribePublicApiCheck());
    }

}
