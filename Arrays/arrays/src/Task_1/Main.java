package Task_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int [20];
        Main.initializeArray(array);
        Main.max(array);
    }

    public static void initializeArray(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the numbers for array: ");
        for (int i = 0; i < array.length; i++) {
            int numeric = in.nextInt();
            array[i] = numeric;
        }
    }
    public static void max(int[] array) {
        System.out.println("LengthWordsArray: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
