package org.launchcode.java.studios;

import java.util.Scanner;

public class GetCircleRadiusFromUser {

    private GetCircleRadiusFromUser() {
    }

    private static double readRadiusFromUser() {

        //create scanner
        Scanner scan = new Scanner(System.in);

        //Tell the user what we want
        System.out.println("What is the radius of the circle?");

        if (!scan.hasNextDouble()) {
            System.out.println("Radius must be a number.");
            return readRadiusFromUser();
        }
        double radius = scan.nextDouble();

        if (radius <= 0) {
            System.out.println("Radius must be >= 0. \nPlease enter the radius of the circle.");
            return readRadiusFromUser();
        }
        return radius;
    }


    static double getRadius() {

        //return scanner text
        return readRadiusFromUser();
    }


}
