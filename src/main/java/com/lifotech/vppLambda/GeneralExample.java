package com.lifotech.vppLambda;

/**
 * Created by sksingh on 5/16/17.
 */
public class GeneralExample {

    @FunctionalInterface
    interface LambdaInterface {
        void someMethod(String s, Integer i);

    }

    public static void doSomeThing(LambdaInterface lambdaInterface) {
        lambdaInterface.someMethod("Matt", 1);
    }

    public static void main(String[] args) {

        LambdaInterface lambdaInterface = (String s, Integer i) -> {
            System.out.println("Hello " + s);
            System.out.println("you are a number " + i);
        };

        doSomeThing(lambdaInterface);

    }
}





