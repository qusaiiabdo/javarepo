package com.udayankhattry.test;

 class MyClass {
    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = null;
        obj.myStaticMethod(); // Calling static method through reference variable (incorrect)
        MyClass.myStaticMethod(); // Correct way to call static method
    }
}
