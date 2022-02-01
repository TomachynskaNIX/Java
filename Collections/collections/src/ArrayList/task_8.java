package ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task_8 {
public static void main(String[] args) throws IOException {

    ArrayList<String> list = new ArrayList<String>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 5; i++) {
        list.add(reader.readLine());
    }

    int maxSize = 0;
    for (int i=1; i<list.size(); i++)
    {

        if (list.get(i-1).length() > list.get(i).length())
        {
            maxSize = list.get(i-1).length();
            list.remove(i);
        }
        else
        if (list.get(i-1).length()< list.get(i).length())
        {
            maxSize = list.get(i).length();
            list.remove(i-1);
        }

    }
    for(int i=0; i<list.size(); i++)
    {
        if (maxSize == list.get(i).length())
            System.out.println(list.get(i));
    }
}
}
