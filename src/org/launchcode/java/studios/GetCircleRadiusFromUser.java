package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by rebeccahubbard on 5/8/17.
 * This class gets the
 */

public class GetCircleRadiusFromUser {

    public static double readRadiusFromUser() {

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


    public static double main() {

        //return scanner text
        return readRadiusFromUser();
    }


}
