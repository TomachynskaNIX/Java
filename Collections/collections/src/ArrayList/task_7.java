package ArrayList;

import java.util.ArrayList;

public class task_7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("qwe");
        list.add("rty");
        list.add("uio");
        list.add("asd");
        list.add("fgh");

        System.out.println("List size: " + list.size());

        for(int i=0; i<list.size(); i++)
        {
                System.out.println("[" + i + "]" + list.get(i));
        }

    }
}
