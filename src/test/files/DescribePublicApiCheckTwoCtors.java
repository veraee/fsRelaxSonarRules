

/**
 * Some class documentation
 */
public class DescribePublicApiCheckTwoCtors {

    public DescribePublicApiCheckTwoCtors(String s1, String s2) { // Noncompliant {{Document this public constructor by adding an explicit description.}}
        System.out.println("s1" + s1 + " s2" + s2);
    }

    public DescribePublicApiCheckTwoCtors(String s) { // Noncompliant {{Document this public constructor by adding an explicit description.}}
        System.out.println("s" + s);
    }

}
