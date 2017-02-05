package de.gliderpilot.semanticrelease.test;

//Test
public class Test {

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }

    public static String helloWorld() {
        return hello("World");
    }

    public static String hello(String who) {
        return "Hello " + who;
    }

}
