package Task_1;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 'a': ");
        int a = in.nextInt();
        System.out.print("Input 'b': ");
        int b = in.nextInt();
        if (a > b) {
            System.out.print("a > b, a = " + b);
        }
        else if (a < b) {
            System.out.print("a < b, a = " + a);
        }
        else  {
            System.out.print("a = b");
        }
    }
}
