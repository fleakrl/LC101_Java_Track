package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;

/**
 * Counting Characters
 * <p>
 * Write a program that calculates the number of times each character occurs in a string
 * and prints these counts to the console.  You could get the string as input from the user,
 * but for the sake of simplicity, you may also hard-code the string into your program as
 * the value of a variable.
 * <p>
 * Created by Rebecca Fleak on 5/11/17.
 */


public class CountingChars {
    private CountingChars() {
    }

    private static void printAlphaCharsInMap(Map<Character, Integer> characterMap) {

        for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {

            if (!Character.isAlphabetic(entry.getKey())) {
                continue;
            }

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private static void countcharacters() {


        // Get user input text for character count
        String userinput = GetUserInput.GetUserInputMethod("What text would you " +
                "like to count the characters in?");

        // Create a map to store the characters & count
        Map<Character, Integer> characterCountMap = new HashMap<>();

        //
        for (Character textChar : userinput.toCharArray()) {

            textChar = Character.toUpperCase(textChar);

            if (!characterCountMap.containsKey(textChar)) {
                characterCountMap.put(textChar, 1);
            } else {
                characterCountMap.put(textChar, characterCountMap.get(textChar) + 1);
            }

        }
        printAlphaCharsInMap(characterCountMap);
    }


    public static void main(String[] args) {
        countcharacters();


    }


}




