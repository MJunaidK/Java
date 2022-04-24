package com.mjk;

public class Main {

    public static void main(String[] args) {

        // Expressions

        // component between the brackets are expression
        int score = 100; // score = 100 is expression
        if (score > 99){ // score > 99 is expression
            System.out.println("You got the high score"); // "You got the high score is an expression"
            score =0; // score = 0 is expression
        }

        // Statements

        int myVariable = 50; // myVariable = 50 is the expression and int myVariable = 50; is the statement
        myVariable++; // Statement
        myVariable--; //Statement
        System.out.println("This is a test"); //Statement

        System.out.println("This is" +
                        "another" +
                        "still more.");   // multiple line also forms one statement

        int anotherVariables =5; myVariable--; // multiple statement on one line.

        // If keywords and code blocks

        boolean gameOver = true;
        int myScore =5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(myScore == 5000)
            System.out.println("My score was 5000");

        if(myScore < 5000 && myScore > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if (myScore < 1000){
            System.out.println("Your score was less than 1000");
        }else{
            System.out.println("Got here!");
        }

    }
}
