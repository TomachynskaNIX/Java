package Task_3;
import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        System.out.println("Input 3 numbers: ");
        for (int i = 0; i < array.length; i++) {
            int num = in.nextInt();
            array[i] = num;
        }

        int buf;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < array[i+1]){
                buf = array[i];
                array[i] = array[i+1];
                array[i+1] = buf;
            }
        }

        for (int i = 0; i < array.length; i++) {
          System.out.println(array[i]);
      }
    }
}

