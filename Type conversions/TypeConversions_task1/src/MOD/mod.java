package MOD;
import java.util.Scanner;

public class mod {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first natural number: " );
        int q = input.nextInt();
        System.out.print("Input second natural number: " );
        int w = input.nextInt();
        System.out.println(q % w);
    }
}
