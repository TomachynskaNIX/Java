package Task_14;
import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input m: ");
        int m = in.nextInt();
        System.out.println("Input n: ");
        int n = in.nextInt();

        for (int i = 1; i <= m; i ++) {
            for (int j = 1; j < n; j ++) {
                System.out.print('8');
            }
            System.out.println('8');

        }
    }
}
