package org.launchcode.java.studios;


/**
 * Created by rebeccahubbard on 5/8/17.
 */
public class CircleArea {

    private static double calculateCircleArea() {
        double pi = 3.14;
        double radius = GetCircleRadiusFromUser.main();
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(calculateCircleArea());

    }


}

