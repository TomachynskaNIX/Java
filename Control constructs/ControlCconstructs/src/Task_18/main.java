package Task_18;
import java.lang.InterruptedException;

public class main {
    public static void main (String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i --) {
            if (i == 0) {
                System.out.print("Бум!");
                break;
            }
            System.out.print(i + " ");
            Thread.sleep(100);
        }
    }
}
