import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;

public class CommonsOldCommonsCurrentCheckC3C4 {

    public void tryCommons() {
        Collection col4 = CollectionUtils.EMPTY_COLLECTION;
        int col4size = CollectionUtils.size(col4);
        Collection col3 = org.apache.commons.collections.CollectionUtils.EMPTY_COLLECTION;
        int col3size = org.apache.commons.collections.CollectionUtils.size(col3); // Noncompliant {{Use current version of commons collections collections4}}
    }
}
