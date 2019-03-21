package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void lambMethod(String s1, String s2, String s3, MyInterface myInterface){
        System.out.println(myInterface.metodaGo(s1, s2, s3));
         System.out.println("zmiana zdalna");

        System.out.println("zmiana zdalna2");


        System.out.println("zmiana lokalna");

    }


    public static void main(String[] args) {
        lambMethod("a", "b", "c", (x,y,z) -> x.startsWith("a") && y.startsWith("b") && z.startsWith("z"));
        lambMethod("a", "b", "c", (x,y,z) -> x.contains("a") && y.contains("b") && z.contains("z"));
        lambMethod("a", "b", "c", (x,y,z) -> x.endsWith("a") && y.endsWith("b") && z.endsWith("z"));
        lambMethod("aba", "aac", "aad", (x,y,z) -> x.equals("aba") & y.equals("aac") && z.equals("aad"));
        lambMethod("abal", "aacl", "aadl", (x,y,z) -> x.equals("abal") & y.equals("aacl") && z.equals("aadl"));
    }
}





