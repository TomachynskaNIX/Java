package Task_7;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        int secret;
        secret = random.nextInt(20 + 1);
        System.out.println(secret);

        int countAttempts = 0;

        while (countAttempts <= 7) {
            System.out.println("Input value (" + (7 - countAttempts) + " attempts left): ");
            int inputValue = in.nextInt();
            countAttempts++;

            if (inputValue == secret) {
                System.out.println("Угадал :)");
                break;
            }
            else if (countAttempts == 7) {
                System.out.println("Не угадал :(");
                break;
            }
        }
    }
}
