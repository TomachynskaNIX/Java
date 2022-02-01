package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task_10 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            String inputString = reader.readLine();
            list.add(0,(inputString));
        }
        for(String i: list){
            System.out.println(i);
        }
    }
}
