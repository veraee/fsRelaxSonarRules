
/**
 * Some documentation 1
 */
public class DescribePublicApiCheck1 {

    /**
     * Some documentation 2
     */
    public DescribePublicApiCheck1() {
    }

    public void myPublicMethodVoidNoParams() { // Noncompliant {{Document this public method by adding an explicit description.}}
        System.out.println("myPublicMethodVoidNoParams");
    }

    public void myPublicMethodVoidWithParams(String str) { // Noncompliant {{Document this public method by adding an explicit description.}}
        System.out.println("myPublicMethodVoidWithParams" + str);
    }

    public String myPublicMethod1NonVoidNoParams() { // Noncompliant {{Document this public method by adding an explicit description.}}
        System.out.println("myPublicMethod1NonVoidNoParams");
        return "str";
    }

    public String myPublicMethod1NonVoidWithParams(String str) { // Noncompliant {{Document this public method by adding an explicit description.}}
        System.out.println("myPublicMethod1NonVoidWithParams" + str);
        return "str" + str;
    }

    /**
     * Some explicit description of the method but not for each parameter.
     */
    public void myPublicMethod2(String s) {
        System.out.println("myPublicMethod2" + s);
    }



}
