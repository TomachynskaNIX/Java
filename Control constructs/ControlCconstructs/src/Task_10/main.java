package Task_10;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        String stringForRepetitions = in.nextLine();
        System.out.println("Input number of repetitions: ");
        int numberOfRepetitions = in.nextInt();
        int i = 0;

        while(i < numberOfRepetitions ) {
            System.out.println(stringForRepetitions);
            i++;
        }
    }
}
