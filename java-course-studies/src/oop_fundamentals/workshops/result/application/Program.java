package oop_fundamentals.workshops.result.application;

import oop_fundamentals.workshops.result.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student result;
        result = new Student();

        result.name = sc.nextLine();
        result.scoreA = sc.nextDouble();
        result.scoreB = sc.nextDouble();
        result.scoreC = sc.nextDouble();

        System.out.println(result);

        sc.close();
    }
}
