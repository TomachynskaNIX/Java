package NumberSum;
import java.util.Scanner;

public class NumberSum {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        long n = input.nextInt();
        System.out.println(Long.toString(n).length());
    }
}
