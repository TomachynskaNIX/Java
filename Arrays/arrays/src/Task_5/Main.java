package Task_5;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] mainArray = new int[20];
        initializeArray(mainArray);
        int[] firstSmallArray = Arrays.copyOfRange(mainArray, 0, 10);
        int[] secondSmallArray = Arrays.copyOfRange(mainArray, 10, 20);
        outputArrays(firstSmallArray, secondSmallArray);
    }

    static void initializeArray (int[] mainArray) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the numbers for array: ");
        for (int i = 0; i < mainArray.length; i++) {
            int numeric = in.nextInt();
            mainArray[i] = numeric;
        }
    }

    static void outputArrays(int[] firstSmallArray, int[] secondSmallArray) {
        System.out.println("first array: ");
        for (int i = 0; i < firstSmallArray.length; i++ ) {
            System.out.println("["+ i + "] = " + firstSmallArray[i]);
        }
        System.out.println("second array: ");
        for (int i = 0; i < secondSmallArray.length; i++ ) {
            System.out.println("["+ i + "] = " + secondSmallArray[i]);
        }
    }
}
