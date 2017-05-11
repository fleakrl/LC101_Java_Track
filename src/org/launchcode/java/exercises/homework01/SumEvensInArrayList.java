package org.launchcode.java.exercises.homework01;


import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList: Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */
public class SumEvensInArrayList {

    private SumEvensInArrayList() {
    }


    static int sumEvens(List<Integer> numberList) {

        int evenSum = 0;

        for (Integer aNumber : numberList) {

            if (aNumber % 2 == 0) {
                evenSum += aNumber;
            }

        }
        return evenSum;
    }

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        System.out.println(sumEvens(numberList));
    }
}
