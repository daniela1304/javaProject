package com.company;

import java.util.List;

/**
 * Created by todescudaniela on 7/20/2017.
 */
public class Display {
    Computer com = new Computer();
    ReadInput read = new ReadInput();
    LogicalOperations compare = new LogicalOperations();

    public void sum() {
        System.out.println("Introdu doua numere.");
        int nr1 = read.readInteger();
        int nr2 = read.readInteger();
        Computer calculator = new Computer();
        System.out.println("Rezultatul este: ");
        System.out.println(calculator.sum(nr1, nr2));
    }

    public void transformTemperatureFromFToC() {
        System.out.print("Introduce a temperature (F): ");
        float F = read.readFloatNumber();
        double C = com.convertFtoC(F);
        System.out.print("Temperaure in C: " + C);
    }

    public void displayTheGreatestNmber() {
        System.out.println("Give two numbers");
        System.out.print("First number: ");
        int a = read.readInteger();
        System.out.print("Second number: ");
        int b = read.readInteger();
        System.out.print("The greatest number is: " + compare.verifyTheGreatest(a, b));
    }

    public void displayTheNumberFromAnInterval() {
        System.out.println("Give the limit numbers to compare");
        System.out.print("First number: ");
        int number1 = read.readInteger();
        System.out.print("Second number: ");
        int number2 = read.readInteger();
        System.out.print("Give the number to compare: ");
        int n = read.readInteger();
        if (com.CompareBetweenTwoNr(number1, number2, n) != (number1 - 1))
            System.out.println("Number " + n + " ∈ [" + number1 + ", " + number2 + "]");
        else System.out.println("The number isn't in the interval!");
    }

    public void displayStringAndText() {
        System.out.print("Give a text: ");
        String text = read.readString();
        System.out.print("Give a string to compare: ");
        String str = read.readString();
        System.out.print("Give a number: ");
        int nr = read.readInteger();
        System.out.print("Give a number to compare: ");
        int compareNr = read.readInteger();
        if (!(compare.printTextAndNr(text, str, nr, compareNr))) ;
        System.out.println("Have a nice day!");
        if (!(compare.printNrAndText(text, str, nr, compareNr))) ;
        System.out.println("Have a nice day!");
    }

    public void displayWeatherInWinter() {
        System.out.print("Give the cm of snow: ");
        int cm = read.readInteger();
        System.out.print("Read the first number: ");
        int firstNumberCm = read.readInteger();
        System.out.print("Read the second number: ");
        int secondNumberCm = read.readInteger();
        compare.winterIsComing(cm, firstNumberCm, secondNumberCm);
    }

    public void displayComparison() {
        System.out.print("Read a number: ");
        int nmbr = read.readInteger();
        System.out.print("Read the first number to compare: ");
        int firstNmbr = read.readInteger();
        System.out.print("Read the second number to compare: ");
        int secondNmbr = read.readInteger();
        compare.compareWithTwoNr(nmbr, firstNmbr, secondNmbr);
    }
    public void dislayNumberSelected(){
        System.out.print("Read a number between 0 and 9: ");
        int figure = read.readInteger();
        compare.switchBetween0And9(figure);
    }
    public void displayEvenNumber(){
        System.out.print("Read a number: ");
        float number = read.readFloatNumber();
        compare.checkEvenNumber(number);

    }
    public void displayVotePermission(){
        System.out.print("Enter your age: ");
        int age = read.readInteger();
        compare.compareAgeForVoting(age);
    }
    public void displayGrade(){
        System.out.println("Which is your score (quiz + mid-termfinal + scores)/3 ? ");
        System.out.print("Read quiz: ");
        int quiz = read.readInteger();
        System.out.print("Read mid-term: ");
        int mid_term = read.readInteger();
        System.out.print("Read final scores: ");
        int final_score = read.readInteger();
        compare.determinateGrade(quiz, mid_term, final_score);

    }
    public void displayQuestionnaire(){
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println(" a. int 1x=10;\n b. int x=10;\n c. float x=10.0f;\n d. String x=\"10\";");
        System.out.print("Enter your choice:");
        String choice = read.readString();
        compare.chooseTheCorrectAnswer(choice);
        if (choice.equals("b") == true || choice.equals("c") == true || choice.equals("d") == true || choice.equals("b c d") == true)
            System.out.println("Correct answer!");
        else System.out.println("Not a correct answer!");

    }
    public void displaySearchedElement(){
        System.out.println("Introduce the elements of the array: ");
        List<Integer> arraylist = read.readList();
        System.out.print("Read an element to search in array: ");
        int element = read.readInteger();
        System.out.println("Element " + element + " founded for " + compare.searchElement(element, arraylist) + " times in array.");

    }

    public void displayPatternDescending(){
        System.out.print("Give a size : ");
        int size1 = read.readInteger();
        compare.returnElementsDescending(size1);
    }
    public void displayPatternNumberAscending(){
        System.out.print("Give a size : ");
        int size2 = read.readInteger();
        compare.returnElementsReplacedWithNumbers(size2);

    }
    public void displayElementsFromListExceptingNthElemnt(){
        System.out.println("Introduce the elements of the list: ");
        List<Integer> list = read.readList();
        System.out.println("Introduce the n item to remove: ");
        int item = read.readInteger();
        System.out.println("List sorted with lements of the original list, excepting every nth item is: " + compare.sortAndRemove(item, list));
    }

}

