package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class CommonsOldCommonsCurrentCheckTest {

    @Test
    public void collectionsV3() {
        JavaCheckVerifier.verify("src/test/files/CommonsOldCommonsCurrentCheckC3.java", new CommonsOldCommonsCurrentCheck());
    }

    @Test
    public void collectionsV3AndV4() {
        JavaCheckVerifier.verify("src/test/files/CommonsOldCommonsCurrentCheckC3C4.java", new CommonsOldCommonsCurrentCheck());
    }

    @Test
    public void langV2() {
        JavaCheckVerifier.verify("src/test/files/CommonsOldCommonsCurrentCheckL2.java", new CommonsOldCommonsCurrentCheck());
    }

    @Test
    public void langV2AndV3() {
        JavaCheckVerifier.verify("src/test/files/CommonsOldCommonsCurrentCheckL2L3.java", new CommonsOldCommonsCurrentCheck());
    }

}
