package Round;
import java.util.Scanner;
import java.lang.Math;

public class Round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input fractional number: ");
        double n = input.nextDouble();
        System.out.print(Math.round(n));
    }
}
