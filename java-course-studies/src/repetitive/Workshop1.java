package repetitive;

import java.util.Scanner;

public class Workshop1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        while (x != 0){
            sum += x;
            x = sc.nextInt();
        }

        System.out.println(sum);

        sc. close();
    }
}
