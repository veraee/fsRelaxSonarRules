package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class RelaxedUndocumentedApiCheckOverriddenMethodRegressionTest {

    @Test
    public void describeMethodNoNeedToDocumentParams() {
        JavaCheckVerifier.verifyNoIssue("src/test/files/DescribePublicApiCheckOverriddenMethod1.java", new RelaxedUndocumentedApiCheck());
    }


}
