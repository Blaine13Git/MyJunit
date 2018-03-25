package com.my;

public class myMain {

    static void myPrint() {
        System.out.println("XXX");
    }

    public static void main(String[] args) {
        String boot_class_path = System.getProperty("sun.boot.class.path");
        System.out.println(boot_class_path);
        myPrint();
    }
}
