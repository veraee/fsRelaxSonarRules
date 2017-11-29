package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class RelaxedUndocumentedApiCheckTest {

    @Test
    public void describeMethodNoNeedToDocumentParams() {
        JavaCheckVerifier.verify("src/test/files/DescribePublicApiCheck1.java", new RelaxedUndocumentedApiCheck());
    }


}
