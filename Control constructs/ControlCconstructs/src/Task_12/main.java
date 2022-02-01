package Task_12;

public class main {
    public static void main (String[] args) {
        int i = 1, j = 1;
        while (j <= 10) {
            while (i < 10) {
                System.out.print(i * j + " ");
                i++;
            }
            System.out.println(i * j);
            j++;
            i=1;
        }
    }
}
