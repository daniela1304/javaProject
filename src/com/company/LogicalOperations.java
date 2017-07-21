package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by todescudaniela on 7/17/2017.
 */
public class LogicalOperations {
    public int verifyTheGreatest(int x, int y) {

        if (x > y)
            return x;
        else return y;
    }

    public boolean printTextAndNr(String text, String str, int nr, int compareNr) {
        if (text.equals(str) == true && nr <= compareNr) {
            System.out.println("The given text is: " + text);
            System.out.println("The given number is: " + nr);
        }
        return true;

//         else System.out.println("Have a nice day!");
    }

    public boolean printNrAndText(String text, String str, int nr, int compareNr) {
        if (text.equals(str) == false && nr >= (compareNr + 1)) {
            System.out.println("The given number is: " + nr);
            System.out.println("The given text is: " + text);
        }
        return true;

// else System.out.println("Have a nice day!");
//        return false;
    }

    public void winterIsComing(int nr, int a, int b) {
        if (nr >= a || nr == b)
            System.out.println("The amount of snow this winter was(cm): " + nr);
        else System.out.println("The forecast snow is(cm):" + nr);

    }

    public void compareWithTwoNr(int nr, int NrToCompare1, int NrToCompare2) {
        if (nr > NrToCompare1 && nr != NrToCompare2)
            System.out.println("The number is greater than " + NrToCompare1 + " and not equal to " + NrToCompare2);
        else if (nr == NrToCompare2)
            System.out.println("The number is equal to " + NrToCompare2);
        else if (nr < NrToCompare1)
            System.out.println("The number is lower than " + NrToCompare1);
        else if (nr == NrToCompare1)
            System.out.println("The number is equal to " + NrToCompare1);
    }

    public void switchBetween0And9(int key) {
        switch (key) {
            default:
                System.out.println("Not a figure!");
                break;
            case 0:
                System.out.println("You pressed number " + key);
                break;
            case 1:
                System.out.println("You pressed number " + key);
                break;
            case 2:
                System.out.println("You pressed number " + key);
                break;
            case 3:
                System.out.println("You pressed number " + key);
                break;
            case 4:
                System.out.println("You pressed number " + key);
                break;
            case 5:
                System.out.println("You pressed number " + key);
                break;
            case 6:
                System.out.println("You pressed number " + key);
                break;
            case 7:
                System.out.println("You pressed number " + key);
                break;
            case 8:
                System.out.println("You pressed number " + key);
                break;
            case 9:
                System.out.println("You pressed number " + key);
                break;

        }
    }

    public void checkEvenNumber(float number) {
        if (number % 2 == 0)
            System.out.println("It's an even number!");
        else System.out.println("It's not an even number!");

    }

    public void compareAgeForVoting(int age) {
        if (age >= 18)
            System.out.println("You are eligible to vote!");
        else System.out.println("You are not eligible to vote!");

    }

    public void determinateGrade(int quiz, int mid_term, int final_scores) {
        float average = (quiz + mid_term + final_scores) / 3;
        if (average >= 90)
            System.out.println("Your grade is A.");
        else if (average >= 70)
            System.out.println("Your grade is B.");
        else if (average >= 50)
            System.out.println("Your grade is C.");
        else if (average < 50)
            System.out.println("Your grade is F.");
    }

    public void chooseTheCorrectAnswer(String option) {
        switch (option) {
            default:
                System.out.println("Not a choice!");
                break;
            case "a":
                System.out.println("You chooseed " + option);
                break;
            case "b":
                System.out.println("You chooseed " + option);
                break;
            case "c":
                System.out.println("You chooseed " + option);
                break;
            case "d":
                System.out.println("You chooseed " + option);
                break;
            case "b c d":
                System.out.println("You chooseed " + option);
                break;

        }
    }

    public int searchElement(int element, List<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element)
                counter++;
        }
        return counter;

    }

    public void returnElementsDescending(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i); j++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }

    public void returnElementsReplacedWithNumbers(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = 0; k < size - i; k++) {
                System.out.print("*");

            }
            //System.out.print("*");
            System.out.println();
        }
    }
        public  List<Integer> sortAndRemove(int n, List<Integer> arr){
            ArrayList<Integer> newArray = new ArrayList<Integer>();

            boolean swapped = true;
            int j = 0;
            int tmp;
            while (swapped) {
                swapped = false;
                j++;
                for (int i = 0; i < arr.size() - j; i++) {
                    if (arr.get(i) > arr.get(i + 1)) {
                        tmp = arr.get(i);
                        arr.set(i, arr.get(i + 1));
                        arr.set(i + 1, tmp);
                        swapped = true;
                    }
                }
            }


            for(int i = 0; i < arr.size(); i++) {
                if(!((i + 1) % n == 0)) {
                    newArray.add(arr.get(i));
                }
            }

            return newArray;
        }


}

