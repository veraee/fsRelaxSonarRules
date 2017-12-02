
/**
 * Some documentation 1
 */
public class DescribePublicApiCheckOverriddenMethod1 {

    /**
     * Some documentation 2
     */
    public static class TheParentClass {

        /**
         *  Some documentation M
         */
        public int getValue(String a, int b) {
            return 1;
        }
    }

    /**
     * Some documentation 3
     */
    public static class TheSubClass extends TheParentClass {

        public int getValue(String a, int b) {
            return 2;
        }

    }

}
