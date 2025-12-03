package repetitive;

import java.util.Scanner;

public class Workshop4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while (code != 4){

            if (code == 1) {
                alcohol++;
            } else if (code == 2) {
                gasoline++;
            } else if (code == 3) {
                diesel++;
            }
            code = sc.nextInt();
        }
        System.out.println("Thank You!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);

        sc. close();
    }
}
