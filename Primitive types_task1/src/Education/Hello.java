package Education;
import java.util.Scanner;

public class Hello {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String username = input.nextLine();
        System.out.println("Hello, " + username);
    }
}

