package conditional;

import java.util.Locale;
import java.util.Scanner;

public class Workshop5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("1 Hot-Dog $ 4.00");
        System.out.println("2 X-Salad $ 4.50");
        System.out.println("3 X-Bacon $ 5.00");
        System.out.println("4 Plain Toast $ 2.00");
        System.out.println("5 Soda $ 1.50");
        System.out.println();
        System.out.println("ENTER THE CODE AND QUANTITY:");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int amount = sc.nextInt();

        double total;
        if (code == 1) {
            total = amount * 4.0;
        }
        else if (code == 2) {
            total = amount * 4.5;
        }
        else if (code == 3) {
            total = amount * 5.0;
        }
        else if (code == 4) {
            total = amount * 2.0;
        }
        else {
            total = amount * 1.5;
        }

        System.out.printf("Total: $ %.2f%n", total);

        sc.close();
    }
}