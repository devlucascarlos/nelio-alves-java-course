package programming_logic;

import java.util.Scanner;
import java.util.Locale;

public class Workshop4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.println("SOMA: " + result);

        sc.close();
    }
}
