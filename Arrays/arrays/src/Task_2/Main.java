package Task_2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input the words for array: ");

        String[] list = new String[10];

        for (int i = 0; i < list.length - 2; i++)
        {
            String word = reader.readLine();
            list[i] = word;
        }
        System.out.println("Array content: ");
        outputArrayContent(list);
    }

    public static void outputArrayContent (String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
