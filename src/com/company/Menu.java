package com.company;

import java.util.List;

/**
 * Created by todescudaniela on 7/19/2017.
 */
public class Menu {
    Computer com = new Computer();
    ReadInput read = new ReadInput();
    LogicalOperations compare = new LogicalOperations();


    public void printOptions() {
        System.out.println("\n Here are the options of the MENU: \n" +

                "1. Sum \n" +
                "2. Convert temperature from F to C \n " +
                "2. Print the greatest number \n" +
                "3. Compare two strings \n" +
                "4. Compare and print a number if is >= x and <=y, where x and y are numbers. \n" +
                "5. Compare two string and two number and print (text + number) or (number + text) according to some conditions. \n" +
                "6. See deatils about snow. \n" +
                "7. Print a specific message if ( number>x and !=y )or (number==y) or (number<x)or (number==x), where x and y are numbers.\n" +
                "8. Tell the number selected between (0 and 9). \n" +
                "9. Verify is a number is an even number. \n" +
                "10. Determinate if a person is eligible to vote. \n" +
                "11. Determinate your grade. \n" +
                "12. Complete a questionnaire. \n" +
                "13. Search an element of an integer array. \n" +
                "14. See a pattern descending. +\n" +
                "15. See a pattern with numbers +\n" +
                "16. See a list with elements in order, excepting every nth item. \n" +
                "0. LogOut \n");

    }

    public boolean chooseOption(int option) {
        Display display = new Display();
        switch (option) {

            case 1:
                display.sum();
                break;
            case 2:
                display.transformTemperatureFromFToC();
                break;
            case 3:
                display.displayTheGreatestNmber();
                break;
            case 4:
                display.displayTheNumberFromAnInterval();
                break;
            case 5:
                display.displayStringAndText();
                break;
            case 6:
                display.displayWeatherInWinter();
                break;
            case 7:
                display.displayComparison();
                break;
            case 8:
                display.dislayNumberSelected();
                break;
            case 9:
                display.displayEvenNumber();
                break;
            case 10:
                display.displayVotePermission();
                break;
            case 11:
                display.displayGrade();
                break;
            case 12:
                display.displayQuestionnaire();
                break;
            case 13:
                display.displaySearchedElement();
                break;
            case 14:
                display.displayPatternDescending();
                break;
            case 15:
                display.displayPatternNumberAscending();
                break;
            case 16:
                display.displayElementsFromListExceptingNthElemnt();
                break;
            case 0:
                System.out.println("Exit");
                return false;
            default:
                System.out.println("Nu exista aceasta optiune!");
        }
        return true;
    }

    public void runProgram() {
        int option;
        do {
            printOptions();
            System.out.println("Alege optiunea: ");
            option = read.readInteger();
        }
        while (chooseOption(option));


    }

}
