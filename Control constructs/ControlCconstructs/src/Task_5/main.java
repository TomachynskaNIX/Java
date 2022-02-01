package Task_5;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.println("Input your age: ");
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
