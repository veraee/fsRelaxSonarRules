package de.e5n.oss.fsRelaxSonarRules.rules.java.checks;

import com.google.common.collect.ImmutableList;
import org.apache.commons.collections.CollectionUtils;
import org.sonar.check.Rule;
import org.sonar.java.resolve.JavaSymbol;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol;
import org.sonar.plugins.java.api.tree.MethodInvocationTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import java.util.Collections;
import java.util.List;

@Rule(key = "CommonsOldCommonsCurrent")
public class CommonsOldCommonsCurrentCheck extends IssuableSubscriptionVisitor {

    @Override
    public List<Kind> nodesToVisit() {
        return ImmutableList.of(Kind.METHOD_INVOCATION);
    }

    @Override
    public void visitNode(Tree tree) {
        CollectionUtils.isNotEmpty(Collections.EMPTY_LIST);

        MethodInvocationTree methodInvocationTree = (MethodInvocationTree) tree;
        String fqnClass = ((JavaSymbol.MethodJavaSymbol) methodInvocationTree.symbol()).owner().getType().fullyQualifiedName();
        System.out.println("cn|" + fqnClass +"|");

        if (fqnClass.startsWith("org.apache.commons.collections.")) {
            System.out.println("cn|" + fqnClass +"| issue");
            reportIssue(tree, "Use current version of commons collections collections4");
        }

    }

}
