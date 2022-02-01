package HashSet;
import java.util.HashMap;
import java.util.Map;

public class task_5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "b");
        map.put("b", "c");
        map.put("c", "d");
        map.put("d", "e");
        map.put("e", "f");
        map.put("f", "g");
        map.put("g", "h");
        map.put("h", "i");
        map.put("i", "l");
        map.put("j", "k");

        for(Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            System.out.println(value);
        }
    }
}
