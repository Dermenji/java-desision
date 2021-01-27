package com.academy.lecture06;


public class Main {

    public static void main(String[] args) {
    /*    Lecture lecture = new Lecture();
        lecture.checkPeopleRigts(21);
        lecture.ifExample(16);*/
        getMonthNumberOfDays(2, 1996);
    }

    public static void getMonthNumberOfDays(int number, int year) {
        String monthName;
        int numberOfDays;

        switch (number) {
            case 1:
                monthName = "January";
                numberOfDays = 31;
                System.out.println("monthName: " + monthName + ", numberOfDays: " + numberOfDays);
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                System.out.println("monthName: " + monthName + ", numberOfDays: " + numberOfDays);
                break;
            default:
                System.out.println("Not valid");

        }
    }

}
