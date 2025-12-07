package oop_fundamentals.workshops.rectangle.application;

import oop_fundamentals.workshops.rectangle.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        double areaX = x.area();
        double perimeterX = x.perimeter();
        double diagonalX = x.diagonal();

        System.out.printf("Area: %.2f%n", areaX);
        System.out.printf("Perimeter: %.2f%n", perimeterX);
        System.out.printf("Diagonal: %.2f%n", diagonalX);

        sc.close();

    }
}
