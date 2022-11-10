package com.company.TriangleCalculator;

import java.util.Scanner;

public class TriangleCalculator {

    /*
    This class gets multiple inputs from the user, representing the adjacent and opposite sides of a right triangle.
    It then calculates the hypotenuse of the triangle given those inputs and displays it on the console.
    Finally, it calculates the sine, cosine, and tangent of the triangle.
     */

    public static void main(String[] args) {

        // Instantiate new Scanner called scan to get input from user
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the length of the adjacent side of your right triangle.\n");
        double adj = Double.parseDouble(scan.nextLine());

        System.out.println("Please enter the length of the opposite side of your right triangle.\n");
        double opp = Double.parseDouble(scan.nextLine());

        double hyp = Math.sqrt(Math.pow(adj, 2) + Math.pow(opp, 2));
        System.out.println("The hypotenuse of your right triangle is " + hyp);

        double sin = Math.sin(Math.toRadians(90));
        System.out.println("The sine of your right triangle is " + sin);

        double cos = Math.cos(Math.toRadians(90));
        System.out.println("The cosine of your right triangle is " + cos);

        double tan = Math.tan(Math.toRadians(90));
        System.out.println("The tangent of your right triangle is " + tan);

    }
}
