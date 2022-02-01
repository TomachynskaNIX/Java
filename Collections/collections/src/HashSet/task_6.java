package HashSet;
import java.util.HashMap;
import java.util.Map;

public class task_6 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 9);
        map.put("j", 10);

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            String key = pair.getKey();
            Object value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
