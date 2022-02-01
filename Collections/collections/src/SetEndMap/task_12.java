package SetEndMap;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class task_12 {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            set.add("Л" + (reader.readLine()));
        }
    }
}
