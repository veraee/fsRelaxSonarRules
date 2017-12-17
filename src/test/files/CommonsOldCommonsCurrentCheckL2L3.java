import org.apache.commons.lang3.StringUtils;

public class CommonsOldCommonsCurrentCheckL2L3 {

    public void tryCommons() {
        String abr3 = StringUtils.abbreviate("a string",2);
        String abr2 = org.apache.commons.lang.StringUtils.abbreviate("a string",2);  // Noncompliant {{Use current version of commons lang lang3}}
        String both = abr3 + abr2;
    }
}
