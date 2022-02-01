package SetEndMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_16 {
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname4", "Name4");
        map.put("Surname5", "Name5");
        map.put("Surname6", "Name5");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name8");
        map.put("Surname9", "Name9");
        map.put("Surname10", "Name10");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }

}
