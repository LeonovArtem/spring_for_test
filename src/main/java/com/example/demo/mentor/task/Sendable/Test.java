package com.example.demo.mentor.task.Sendable;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    // IS UNCHECKED
    private static void getErrors() {
        throw new Error();
    }

    // IS CHECKED
    private static void getException() throws Exception {
        throw new Exception();
    }

    private static void anotherMethod() {
//        System.out.println(getCallerClassAndMethodName());
        finalMethod();
    }

    private static void finalMethod() {
        lastMethod();
    }

    private static void lastMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] elements = new Throwable().getStackTrace();

        return elements.length > 2
                ? elements[2].getClassName() + "#" + elements[2].getMethodName()
                : null;
    }
}
