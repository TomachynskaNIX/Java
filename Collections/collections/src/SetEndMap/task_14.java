package SetEndMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_14 {

    public static Map<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name4");
        map.put("Surname5", "Name5");
        map.put("Surname6", "Name6");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name8");
        map.put("Surname9", "Name9");

        return map;
    }

    public static String getNameForSearchDuplicate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input name fo search: ");
        String name = in.nextLine();
        return name;
    }

    public static String getSurnameForSearchDuplicate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input name fo search: ");
        String surname = in.nextLine();
        return surname;
    }

    public static void getCountDuplicates(String name, String surname, Map<String,String>map)
    {
        int count = 0;

        for (Map.Entry<String, String> s : map.entrySet())
        {
            if(s.getValue().equals(name) && s.getKey().equals(surname))
                count++;
        }
        System.out.println("Found " + count + " person(s) with the same first and last name");
    }

    public static void main (String [] args) {
        getCountDuplicates(getNameForSearchDuplicate(), getSurnameForSearchDuplicate(), createMap());
    }
}
