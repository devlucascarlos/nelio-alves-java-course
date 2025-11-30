package conditional;

import java.util.Locale;
import java.util.Scanner;

public class Workshop4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int starts = sc.nextInt();
        int ends = sc.nextInt();

        int duration;
        if (starts < ends) {
            duration = ends - starts;
        } else {
            duration = 24 - starts + ends;
        }

        System.out.println("THE GAME LASTED " + duration + " HOUR(S)");

        sc.close();
    }
}