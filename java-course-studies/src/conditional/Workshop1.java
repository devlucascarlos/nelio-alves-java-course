package conditional;

import java.util.Locale;
import java.util.Scanner;

public class Workshop1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("NON NEGATIVE");
        }
        sc.close();
    }
}
