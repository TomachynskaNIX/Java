package Task_4;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first name: ");
        String firstName = in.nextLine();
        System.out.println("Input second name: ");
        String secondName = in.nextLine();

        if (firstName.equals(secondName)) {
            System.out.print("Имена идентичны");
        }
        else {
            if (firstName.length() == secondName.length()) {
                System.out.print("Длины имен равны");
            }
            else {
                System.out.print("Имена разные");
            }
        }
    }
}
