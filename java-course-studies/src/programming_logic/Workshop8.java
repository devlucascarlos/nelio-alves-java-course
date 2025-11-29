package programming_logic;

import java.util.Scanner;
import java.util.Locale;

public class Workshop8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

//      Item 1:
        int code1 = sc.nextInt();
        int amount1 = sc.nextInt();
        double price1 = sc.nextDouble();

//      Item 2:
        int code2 = sc.nextInt();
        int amount2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double totalCost = amount1 * price1 + amount2 * price2;


        System.out.printf("AMOUNT TO PAY = $ %.2f%n", totalCost);

        sc.close();

    }
}
