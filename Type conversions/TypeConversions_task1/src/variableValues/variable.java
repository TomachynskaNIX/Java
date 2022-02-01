package variableValues;
import java.util.Scanner;

public class variable {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();

        c = a + b + c;
        a += b;
        b = c - a;

        System.out.print("a = "+ a + "\nb = " + b + "\nc = " + c);
    }
}
