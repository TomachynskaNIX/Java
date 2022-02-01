package Task_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] reverseArray = new int[10];
        initializeArray(array);
        createReverseArray(array, reverseArray);
        outputReverseArray(reverseArray);
    }
    public static void initializeArray(int[] array) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the numbers for array: ");
        for (int i = 0; i < array.length; i++) {
            int numeric = in.nextInt();
            array[i] = numeric;
        }
    }
    public static void createReverseArray(int[] array, int[] reverseArray) {
        int count = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            for (int j = count; j < reverseArray.length; j++) {
                reverseArray[j] = array[i];
                break;
            }
            count++;
        }
    }
    public static void outputReverseArray(int[] reverseArray) {
        System.out.println("Reverse array: ");
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println("["+ i +"] = " + reverseArray[i]);
        }
    }
}
