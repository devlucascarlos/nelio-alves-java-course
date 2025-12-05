package repetitive;

import java.util.Scanner;
import java.util.Locale;

public class Workshop11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int first = i;
            int second = i * i;
            int third = i * i * i;
            System.out.printf("%d %d %d%n", first, second, third);
        }

        sc.close();
    }
}
