package Task_6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.println("Input your age: ");
        int age = in.nextInt();

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }


    }
}
