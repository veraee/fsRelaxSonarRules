
import org.apache.commons.lang.StringUtils;

public class CommonsOldCommonsCurrentCheckL2 {

    public CommonsOldCommonsCurrentCheckL2() {
        StringUtils.isEmpty(""); // Noncompliant {{Use current version of commons lang lang3}}
    }
}
