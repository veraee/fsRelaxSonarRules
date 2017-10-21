

public class DescribePublicApiCheckMissing { // Noncompliant {{Document either this public class or the single public constructor by adding an explicit description.}}

    public DescribePublicApiCheckMissing(String s) { // Noncompliant {{Document either this public single constructor or the class by adding an explicit description.}}
        System.out.println("s" + s);
    }

}
