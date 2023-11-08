package com.app.tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for the first point (x y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("Enter coordinates for the second point (x y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Details of p1: " + p1.getDetails());
        System.out.println("Details of p2: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("p1 and p2 are located at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.println("p1 and p2 are located at different positions.");
            System.out.println("Distance between p1 and p2 is: " + distance);
        }

        scanner.close();
    }
}

