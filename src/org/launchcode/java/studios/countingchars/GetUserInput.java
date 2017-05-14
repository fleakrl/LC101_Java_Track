package org.launchcode.java.studios.countingchars;

import java.util.Scanner;

/**
 * Input:   prompt
 * Type: String - Tell the user what you want them to enter.
 * Gets & returns user input using the scanner method
 * Created by rebeccahubbard on 5/11/17.
 */

class GetUserInput {
    private GetUserInput() {
    }

    static String GetUserInputMethod(String prompt) {
        //create scanner
        Scanner scan = new Scanner(System.in);

        //Tell the user what we want
        System.out.println(prompt);

        //get the user input
        return scan.nextLine();


    }
}
