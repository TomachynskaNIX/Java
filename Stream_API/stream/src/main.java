import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {

        Collection<String> ArrayList = Arrays.asList("", "zxcvbn", "q", "zxcvbnm", "qw", "", "qwe", "q", "qwer", "qa", "qwert", "qaz", "qwerty", "qazw", "qwertyu", "qazws", "qwertyui", "qazwsx", "qwertyuio", "qazwsxe",
                "qwertyuiop", "qazwsxed", "", "qazwsxedc", "a", "", "as", "r", "asd", "rf", "asdf", "rfv", "asdfg", "rfvt", "asdfgh", "rfvtg", "asdfghj", "rfvtgb", "asdfghjk", "rfvtgby",
                "asdfghjkl", "rfvtgbyh", "", "rfvtgbyhn", "z", "", "zx", "u", "zxc", "uj", "zxcv", "ujm", "zxcvb", "ujmi");

        System.out.print("\n Elements length:  ");
        Stream <String> streamLenght = ArrayList.stream();
        streamLenght.forEach(x -> System.out.print(x.length() + " "));

        System.out.print("\n Without empty elements array: ");
        Stream <String> streamNotEmpty = ArrayList.stream();
        streamNotEmpty.filter(x -> ! x.contains("d")).filter(x -> x.length() != 0).forEach(x -> System.out.print(x + " "));

        System.out.print("\n Alphabetical sorted array: ");
        Stream <String> AscStream = ArrayList.stream();
        AscStream.sorted().forEach(x -> System.out.print(x + " "));
    }
}
