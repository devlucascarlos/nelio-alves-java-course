package programming_logic;

import java.util.Scanner;
import java.util.Locale;

public class Workshop7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double paid = sc.nextDouble();

        double salary = paid * hoursWorked;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = $ %.2f%n", salary);

        sc.close();
    }
}
