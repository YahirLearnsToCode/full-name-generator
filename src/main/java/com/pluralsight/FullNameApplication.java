package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String fullName = getName(myScanner);
        System.out.println("Full name: " + fullName);
    }

    public static String getName(Scanner myScanner) {

        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = myScanner.nextLine().trim() + " ";

        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine().trim();

        //If user has a middle name, trim the middle name to an initial
        if (!middleName.isBlank()) {
            char middleInitial = middleName.charAt(0);
            middleName = middleInitial + ". ";
        }
        // if user has a suffix add the proper comma
        if (!suffix.isBlank()) {
            lastName += ", ";
        }

        return (firstName + middleName + lastName + suffix).toUpperCase();
    }
}