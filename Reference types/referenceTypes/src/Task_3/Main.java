package Task_3;


import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input text with spaces: ");
        String inputString = in.nextLine();

        String [] words = inputString.split(" ");
        String maxWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxWord.length()) {
                maxWord = words[i];
            }
        }
        System.out.print("Max word in text: " + maxWord);
    }
}
