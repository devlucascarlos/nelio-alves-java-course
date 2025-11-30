package conditional;

import java.util.Locale;
import java.util.Scanner;

public class Workshop6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double interval = sc.nextDouble();

        if (interval >= 0 && interval<= 25.0) {
            System.out.println("Interval: [0,25]");
        }
        else if (interval > 25.0 && interval <= 50.0) {
            System.out.println("Interval: (25,50]");
        }
        else if (interval > 50.0 && interval <= 75.0) {
            System.out.println("Interval: (50,75]");
        }
        else if (interval > 75.0 && interval <= 100.0) {
            System.out.println("Interval: (75,100]");
        }
        else {
            System.out.println("OUT OF INTERVAL");
        }

        sc.close();
    }
}