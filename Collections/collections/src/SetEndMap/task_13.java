package SetEndMap;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task_13 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i < 20; i++) {
            Integer value = in.nextInt();
            set.add(value);
            if (value > 10) {
                set.remove(value);
            }
        }

        System.out.println("Set with value < 10: ");
        for (Integer value : set)
        {
            System.out.println(value);
        }
    }
}