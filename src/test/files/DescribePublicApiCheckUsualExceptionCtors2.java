
/**
 * Some class documentation
 */
public class DescribePublicApiCheckUsualExceptionCtors2 extends Exception {

    public DescribePublicApiCheckUsualExceptionCtors2() {
        super();
    }

    public DescribePublicApiCheckUsualExceptionCtors2(int message) { // Noncompliant {{Document this public constructor by adding an explicit description.}}
        super("ctor with unusual signature needs documentation");
    }

    public DescribePublicApiCheckUsualExceptionCtors2(String message, Throwable cause) {
        super(message, cause);
    }

    public DescribePublicApiCheckUsualExceptionCtors2(Throwable cause) {
        super(cause);
    }

    protected DescribePublicApiCheckUsualExceptionCtors2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
