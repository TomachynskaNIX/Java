package Task_15;
import java.lang.InterruptedException;

public class main {
    public static void main (String[] args) throws InterruptedException {
        int count = 0;
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < count ; j ++) {
                System.out.print("8 ");
            }
            System.out.println("8");
            count++;
        }
    }
}
