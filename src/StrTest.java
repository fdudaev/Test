import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class StrTest {

    public static void main(String[] args) {


        String name = "Abduqahor";

        System.out.println(new StringBuilder(name.toLowerCase()).reverse());

        String revName = "";

        for (int i = 0; i < name.length(); i++){
            revName = name.charAt(i) + revName;
        }
        System.out.println(revName);

        String str = "LongMyString";
        int half = str.length() / 2;

        System.out.println(str.substring(half -1, half +2));






        System.out.println(str.toLowerCase().substring(str.indexOf("g")));
        System.out.println(str.toUpperCase());
        System.out.println(str.lastIndexOf("y"));

        int randomNum = (int) (Math.random()* 100000001);
        System.out.println(Math.decrementExact(randomNum));

        System.out.println(randomNum);
    }
}
