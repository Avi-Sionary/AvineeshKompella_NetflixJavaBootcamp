package com.company.ConverterInterface;

public class ConverterApplication {

    public static void main(String[] args) {
        int day1 = 6;
        int day2 = 8;
        int day3 = 3;
        int day4 = 0;

        int month1 = 6;
        int month2 = 91;
        int month3 = 3;
        int month4 = -1;

        ConverterIf cIf = new ConverterIf();
        ConverterSwitch cSwitch = new ConverterSwitch();

        System.out.println(cIf.convertDay(day1));
        System.out.println(cIf.convertDay(day2));
        System.out.println(cSwitch.convertDay(day3));
        System.out.println(cSwitch.convertDay(day4));

        System.out.println(cIf.convertMonth(month1));
        System.out.println(cIf.convertMonth(month2));
        System.out.println(cSwitch.convertMonth(month3));
        System.out.println(cSwitch.convertMonth(month4));
    }

}
