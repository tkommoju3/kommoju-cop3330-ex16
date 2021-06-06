/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class LegalDriver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        String inputAge = input.next();

        int age = Integer.parseInt(inputAge);
        String ret = (age >= 16) ? "You are old enough to legally drive." :
                "You are not old enough to legally drive.";
        System.out.println(ret);
    }
}






