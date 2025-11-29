package programming_logic;

import java.util.Scanner;
import java.util.Locale;

public class Workshop9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A, B, C, pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangle = (A * C) /2;
        double circle = pi * C * C;
        double trapezoid = (A + B) * C / 2;
        double square = B * B;
        double rectangle = A * B;

        System.out.printf("TRIANGLE:%.3f%n", triangle);
        System.out.printf("CIRCLE:%.3f%n", circle);
        System.out.printf("TRAPEZOID:%.3f%n", trapezoid);
        System.out.printf("SQUARE:%.3f%n", square);
        System.out.printf("RECTANGLE:%.3f%n", rectangle);

        sc.close();

    }
}
