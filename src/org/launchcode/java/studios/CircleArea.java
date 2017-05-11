package org.launchcode.java.studios;



public class CircleArea {

    private CircleArea() {
    }

    private static double calculateCircleArea() {
        double pi = 3.14;
        double radius = GetCircleRadiusFromUser.getRadius();
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(calculateCircleArea());

    }


}

