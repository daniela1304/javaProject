package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.TreeMap;
public class Main {

    public static void main(String[] args) {
        ReadInput read = new ReadInput();
        LogicalOperations compare = new LogicalOperations();
        Computer com = new Computer();
        Menu m = new Menu();
//1.
//        System.out.print("Introduce a temperature (F): ");
//        float F = read.readFloatNumber();
//        double C= com.convertFtoC(F);
//        System.out.print("Temperaure in C: " +C);
//2.
//        System.out.println("Give two numbers");
//        System.out.print("First number: ");
//        int a = read.readInteger();
//        System.out.print("Second number: ");
//        int b = read.readInteger();
//        System.out.print("The greatest number is: " + compare.VerifyTheGreatest(a, b));
//3.
//        System.out.println("Give a text");
//        String s = read.readString();
//        if(s.equals("Evozon")== true)
//            System.out.println("Learning text comparison");
//        else System.out.println("Got to try some more");
//4.
//        System.out.println("Give the limit numbers to compare");
//        System.out.print("First number: ");
//        int a = read.readInteger();
//        System.out.print("Second number: ");
//        int b = read.readInteger();
//        System.out.print("Give the number to compare: ");
//        int n= read.readInteger();
//        if ( com.CompareBetweenTwoNr(a,b,n) != (a-1) )
//            System.out.println("Number " +n+ " ∈ [" +a+ ", " +b+ "]");
//            else System.out.println("The number isn't in the interval!");
//5.
//        System.out.print("Give a text: ");
//        String text = read.readString();
//        System.out.print("Give a string to compare: ");
//        String str = read.readString();
//        System.out.print("Give a number: ");
//        int nr = read.readInteger();
//        System.out.print("Give a number to compare: ");
//        int compareNr = read.readInteger();
//        compare.printTextAndNr(text, str, nr, compareNr);
//        compare.printNrAndText(text, str, nr, compareNr);
//6.
//        System.out.print("Give the cm of snow: ");
//        int number = read.readInteger();
//        System.out.print("Read the first number: ");
//        int firstNumber = read.readInteger();
//        System.out.print("Read the second number: ");
//        int secondNumber = read.readInteger();
//        compare.winterIsComing(number,firstNumber,secondNumber);
//7.
//        System.out.print("Read a number: ");
//        int number = read.readInteger();
//        System.out.print("Read the first number to compare: ");
//        int firstNumber = read.readInteger();
//        System.out.print("Read the second number to compare: ");
//        int secondNumber = read.readInteger();
//        compare.compareWithTwoNr(number, firstNumber, secondNumber);
//8.
//        System.out.print("Read a number between 0 and 9: ");
//        int figure = read.readInteger();
//        compare.switchBetween0And9(figure);
//10.
//        System.out.print("Read a number: ");
//        float number = read.readFloatNumber();
//        compare.checkIfNumber(number);
//11.
//        System.out.print("Enter your age: ");
//        int age = read.readInteger();
//        compare.compareAgeForVoting(age);
// 12.
//        System.out.println("Read three types of scores(quiz, mid-term, and final scores): ");
//        System.out.print("Read quiz: ");
//        int quiz = read.readInteger();
//        System.out.print("Read mid-term: ");
//        int mid_term = read.readInteger();
//        System.out.print("Read final scores: ");
//        int final_score = read.readInteger();
//        compare.determinateGrade(quiz, mid_term, final_score);

// 13.
//        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
//        System.out.println(" a. int 1x=10;\n b. int x=10;\n c. float x=10.0f;\n d. String x=\"10\";");
//        System.out.print("Enter your choice:" );
//        String choice = read.readString();
//        compare.chooseTheCorrectAnswer(choice);
//       if (choice.equals("b")== true || choice.equals("c")== true || choice.equals("d")== true || choice.equals("b c d")== true)
//           System.out.println("Correct answer!");
//       else System.out.println("Not a correct answer!");
// 15.
//        System.out.print("Read the size for the array: ");
//        int size = read.readInteger();
//        int[] array = new int[size];
//        int i;
//        System.out.println("Introduce the elements of the array: ");
//        for (i = 0; i < array.length; i++) {
//            System.out.print("Array[" + i + "]= ");
//            array[i] = read.readInteger();
//        }
//        System.out.print("Read an element to search in array: ");
//        int element = read.readInteger();
//        System.out.println("Element " + element + " founded for " + compare.searchElement(element, array) + " times in array.");
//16.
//        System.out.print("Give a size : ");
//        int size1 = read.readInteger();
//        compare.returnElementsDescending(size);
// 17.
//        System.out.print("Give a size : ");
//        int size2 = read.readInteger();
//        compare.returnElementsReplacedWithNumbers(size2);
//18.
//        TreeMap<String, Integer> hashmap = new TreeMap<String, Integer>();
//        // System.out.print("Read size of hasmap:");
//        // int n = read.readInteger();
//        String key = "";
//        int value = 0;
//        System.out.println("Introduce the products");
//        do {
//             key = read.readString();
//            value = read.readInteger();
//            hashmap.put(key, value);
//            hashmap.remove("exit");
//
//        }
//        while (key != "exit" && value != 0);
//
//        System.out.println("Products are: " + hashmap);





        //LogIn -> Menu -> LogOut


        Login login = new Login();
        if(login.loginValidation()){
            m.runProgram();
        }
    }
}
