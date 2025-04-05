package com.mkzer.singleton;
public class test{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello");
        logger2.log("World");

        System.out.println(logger1 == logger2); // true
    }
}
