package Task_1;
import java.util.Scanner;


public class Main {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input a string: ");
        String inputString = in.nextLine();

        System.out.println();
         if (inputString.length() % 2 != 0) {
             int indexAverageSymbol = (inputString.length() -1) / 2;
             char averageSymbol = inputString.charAt(indexAverageSymbol);
            {
                 System.out.println(" Begin symbol: " + "<" + inputString.charAt(0) + ">"
                         + " \n End symbol: " + "<" + inputString.charAt(inputString.length() - 1) + ">"
                         + "\n Average symbol: "  + "<" + averageSymbol + ">");
             }
         }
         else {
             System.out.println(" Begin symbol: " + "<" + inputString.charAt(0) + ">"
                     + " \n End symbol: " + "<" + inputString.charAt(inputString.length() - 1) + ">"
                     + "\n Average symbol doesn't exist (the number of letters in a line is even)");
         }


         int dotIndex = inputString.indexOf('.');
         if (dotIndex > 0) {
             System.out.println(" Substring with first dot: " + inputString.substring(0, dotIndex+1));
         }
         else {
             System.out.println(" There are no dots in the line" ); }

         int spaces = inputString.replaceAll("[^ ]", "").length();
         System.out.println(" Number of spaces: " + spaces);
    }
}
