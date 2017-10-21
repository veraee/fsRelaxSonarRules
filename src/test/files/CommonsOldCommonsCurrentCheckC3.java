
import org.apache.commons.collections.CollectionUtils;
import java.util.Collections;

public class CommonsOldCommonsCurrentCheckC3 {

    public CommonsOldCommonsCurrentCheckC3() {
        // import org.apache.commons.collections4.CollectionUtils
        // import org.apache.commons.collections.CollectionUtils;

        //CollectionUtils.isNotEmpty(Collections.EMPTY_LIST);
        CollectionUtils.isNotEmpty(Collections.EMPTY_LIST); // Noncompliant {{Use current version of commons collections collections4}}
        String.format("r");
    }
}
