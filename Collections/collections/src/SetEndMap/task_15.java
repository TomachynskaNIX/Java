package SetEndMap;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class task_15 {
    public static HashMap<String, LocalDate> createMap()
    {
        HashMap<String, LocalDate> map = new HashMap<String, LocalDate>();
        map.put("Surname1", LocalDate.of(2000, 8, 21));
        map.put("Surname2", LocalDate.of(2001, 9, 21));
        map.put("Surname3", LocalDate.of(2002, 10, 21));
        map.put("Surname4", LocalDate.of(2003, 11, 21));
        map.put("Surname5", LocalDate.of(2004, 12, 21));
        map.put("Surname6", LocalDate.of(2005, 1, 21));
        map.put("Surname7", LocalDate.of(2006, 2, 21));
        map.put("Surname8", LocalDate.of(2007, 3, 21));
        map.put("Surname9", LocalDate.of(2008, 4, 21));
        map.put("Surname10", LocalDate.of(2009, 5, 21));

        return map;
    }


    public static void removeItemFromMapByValue (HashMap<String, LocalDate> map) {
        HashMap<String, LocalDate> copy = new HashMap<String, LocalDate>(map);
        for (Map.Entry<String, LocalDate> pair: copy.entrySet())
        {
            if (pair.getValue().getMonthValue() > 6 && pair.getValue().getMonthValue() < 10)
                map.remove(pair.getKey());
        }
    }

    public static void main (String [] args) {
        HashMap <String, LocalDate> map = createMap();
        System.out.println(map);
        removeItemFromMapByValue(createMap());
        System.out.println("\nRemove:"+ map);
    }
}
