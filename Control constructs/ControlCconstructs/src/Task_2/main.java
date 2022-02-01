package Task_2;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[4];
        System.out.println("Input 4 numbers: ");
        for (int i = 0; i < array.length; i++) {
            int num = in.nextInt();
            array[i] = num;
        }
        int max = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < array[i+1]){
                max = array[i+1];
            }
        }
        System.out.print("Max value: " + max);
    }
}
