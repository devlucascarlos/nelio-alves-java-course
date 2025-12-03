package repetitive;

import java.util.Scanner;

public class Workshop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int password = 2002;

        while (input != password){
            System.out.println("Invalid Password");
            input = sc.nextInt();
        }
        System.out.println("Access Allowed");

        sc. close();
    }
}
