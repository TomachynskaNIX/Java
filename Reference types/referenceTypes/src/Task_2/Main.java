package Task_2;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputString = in.nextLine();
        System.out.print("Input substring: ");
        String inputSubstring = in.nextLine();
        System.out.print("Input substring for replacement: ");
        String inputReplaceSubstring = in.nextLine();

        System.out.print("Replaced string: "+ inputString.replace(inputSubstring, inputReplaceSubstring));
    }
}
