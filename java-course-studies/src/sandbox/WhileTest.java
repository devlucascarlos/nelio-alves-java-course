package sandbox;

public class WhileTest {
    public static void main(String[] args) {

        int x = 0;
        int y = 4;

        while (x < 3){
            y += 2;
            x += 1;
            System.out.println(x + "-" + y);
        }

        System.out.println("TEST FINISHED");
    }
}
