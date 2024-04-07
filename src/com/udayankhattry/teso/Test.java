package com.udayankhattry.teso;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        String s="gsdf";
        StringBuilder sb=new StringBuilder(s);

        System.out.println(s.contentEquals(sb));;

        System.out.println(s.equals(sb));

    }
}