public class Main {
    public static void main(String[] args) {
        System.out.println(test_1());
        System.out.println(test_2());
    }

    public static String test_1() {

        return test_2();
    }

    public static String test_2() {
        return getCallerClassAndMethodName();
    }


    public static String getCallerClassAndMethodName() {
        StackTraceElement[] elements = new Exception().getStackTrace();

        return elements.length > 2
                ? elements[2].getClassName() + "#" + elements[2].getMethodName()
                : null;
    }

/*    public static String getCallerClassAndMethodName() {
        try {
            StackTraceElement element = new Throwable().getStackTrace()[2];

            return element.getClassName() + "#" + element.getMethodName();
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }*/
}
