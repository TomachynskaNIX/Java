package Task_17;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        for (int i = 0; i < 10; i ++) {
            System.out.println(name + " любит меня.");
        }
    }
}
