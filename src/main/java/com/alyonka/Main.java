package com.alyonka;

import java.util.ArrayList;

public class Main {

    public static void main(String[] arguments) {
        firstHomeWork();
        secondHomeWork();

    }

    private static void firstHomeWork() {
        int firstInt = 1;
        int secondInt = 2;
        boolean firstBoolean = true;
        boolean secondBoolean = false;
        long firstLong = 12345;
        long secondLong = 123456;
        float firstFloat = 1.1f;
        float secondFLoat = 1.2f;
        double firstDouble = 1.1234;
        double secondDouble = 1.12345;

        // double comparsion
        System.out.println(firstDouble == secondDouble);
        System.out.println(firstDouble >= secondDouble);
        System.out.println(firstDouble <= secondDouble);
        System.out.println(firstDouble < secondDouble);
        System.out.println(firstDouble > secondDouble);
        System.out.println(firstDouble != secondDouble);

        // float comparsion
        System.out.println(firstFloat == secondFLoat);
        System.out.println(firstFloat >= secondFLoat);
        System.out.println(firstFloat <= secondFLoat);
        System.out.println(firstFloat < secondFLoat);
        System.out.println(firstFloat > secondFLoat);
        System.out.println(firstFloat != secondFLoat);

        // int comparsion
        System.out.println(firstInt == secondInt);
        System.out.println(firstInt >= secondInt);
        System.out.println(firstInt <= secondInt);
        System.out.println(firstInt < secondInt);
        System.out.println(firstInt > secondInt);
        System.out.println(firstInt != secondInt);

        // boolean comparsion
        System.out.println(firstBoolean == secondBoolean);
        System.out.println(firstBoolean != secondBoolean);

        // long comparsion
        System.out.println(firstLong == secondLong);
        System.out.println(firstLong >= secondLong);
        System.out.println(firstLong <= secondLong);
        System.out.println(firstLong < secondLong);
        System.out.println(firstLong > secondLong);
        System.out.println(firstLong != secondLong);
    }

    private static void secondHomeWork() {
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        // fill
        firstList.add("a");
        firstList.add("b");
        firstList.add("c");
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);

        // output
        for (String value : firstList) {
            System.out.println(value);
        }
        for (Integer value : secondList) {
            System.out.println(value);
        }
    }
}
