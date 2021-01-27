package com.academy.lecture06;

public class Lecture {


    public void ifExample(int age) {
        if (age < 18)
            System.out.println("Nothing is allowed");
        else if (age >= 18 && age < 21)
            System.out.println("Block 2");
        else
            System.out.println("test");
    }

    public void checkPeopleRigts(int age) {
        boolean isAllowedToDrive = false;
        boolean hasRightsToDrink = false;
        boolean isAllowedToVote = false;

        if (age < 18) {
            System.out.println("Nothing is allowed");
        } else if (age >= 18 && age < 21) {
            isAllowedToDrive = true;
            isAllowedToVote = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote + " hasRightsToDrink: " + hasRightsToDrink
                    + " isAllowedToDrive: " + isAllowedToDrive);
        } else {
            isAllowedToDrive = true;
            isAllowedToVote = true;
            hasRightsToDrink = true;
            System.out.println("isAllowedToVote: " + isAllowedToVote + " hasRightsToDrink: " + hasRightsToDrink
                    + " isAllowedToDrive: " + isAllowedToDrive);
        }

    }
}
