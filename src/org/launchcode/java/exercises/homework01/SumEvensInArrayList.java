package org.launchcode.java.exercises.homework01;


import java.util.ArrayList;

/**
 * ArrayList: Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */
public class SumEvensInArrayList {

    private SumEvensInArrayList() {
    }


    static int sumEvens(ArrayList<Integer> numberList) {

        int evenSum = 0;

        for (int i = 0; i < numberList.size(); i++) {

            int numberToCheck = numberList.get(i);

            if (numberToCheck % 2 == 0) {
                evenSum += numberToCheck;
            }

        }
        return evenSum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        System.out.println(sumEvens(numberList));
    }
}
