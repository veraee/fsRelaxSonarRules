package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class CommonsOldCommonsCurrentCheckTest {

    @Test
    public void test() {
        JavaCheckVerifier.verify("src/test/files/CommonsOldCommonsCurrentCheckC3.java", new CommonsOldCommonsCurrentCheck());
    }

}
