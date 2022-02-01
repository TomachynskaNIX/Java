package SetEndMap;

import java.util.HashMap;

public class task_17 {

    public static HashMap<String, String> createMap()
    {
        HashMap <String, String> map = new HashMap<String, String>();
        map.put("Surname1", "Name1");
        map.put("Surname2", "Name2");
        map.put("Surname3", "Name3");
        map.put("Surname3", "Name2");
        map.put("Surname5", "Name5");
        map.put("Surname6", "Name5");
        map.put("Surname7", "Name7");
        map.put("Surname8", "Name8");
        map.put("Surname9", "Name9");
        map.put("Surname10", "Name10");

        return map;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(map);
    }

}
