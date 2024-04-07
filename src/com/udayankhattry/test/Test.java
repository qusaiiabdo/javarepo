package com.udayankhattry.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Test {
    static Boolean[] arr = new Boolean[1];
    public static void main(String[] args) {
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));
    }
}





