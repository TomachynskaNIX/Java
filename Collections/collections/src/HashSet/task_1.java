package HashSet;
import java.util.HashSet;
import java.util.Set;

public class task_1 {
    public static void main(String[] args) {
        Set<String> plants = new HashSet<String>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("жень-шень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

        for (String text : plants) {
            System.out.println(text);
        }
    }

}
