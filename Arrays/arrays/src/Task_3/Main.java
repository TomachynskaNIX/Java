package Task_3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] list = new String[10];
        int[] lengthWordsArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the words for array: ");
        Main.fillingList(list, reader);
        Main.writeLengthStrings (list, lengthWordsArray);
        Main.outputLengthWordsArray(lengthWordsArray);
    }

    static void fillingList (String[] list, BufferedReader reader) throws IOException {
        for (int i = 0; i < list.length; i++)
        {
            String word = reader.readLine();
            list[i] = word;
        }
    }

    static void writeLengthStrings (String[] list, int[] array){
        int count = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = count; j < array.length; j++) {
                array[j] = list[i].length();
                break;
            }
            count++;
        }
    }

    static void outputLengthWordsArray (int[] array) {
        System.out.println("LengthWordsArray: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("["+ i + "] = " + array[i]);
        }
    }
}
