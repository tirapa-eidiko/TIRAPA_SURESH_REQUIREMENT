package org.neo.controller;

public class CallingStaticMethod {
public static void method() {
    System.out.println("I am in method");
}
public static void main(String[] args) {
    CallingStaticMethod csm = new CallingStaticMethod();
    csm.method();
	// method();
   }
}
