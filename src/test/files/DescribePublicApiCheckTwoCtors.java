package org.sonar.samples.java.checks;


/**
 * Some class documentation
 */
public class DescribePublicApiCheckMissing {

    public DescribePublicApiCheckMissing(String s1, String s2) { // Noncompliant {{Document this public constructor by adding an explicit description.}}
        System.out.println("s" + s);
    }

    public DescribePublicApiCheckMissing(String s) { // Noncompliant {{Document this public constructor by adding an explicit description.}}
        System.out.println("s" + s);
    }

}
