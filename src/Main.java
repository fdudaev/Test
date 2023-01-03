import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String middleTwo = "Muslim";

        int midTwo = middleTwo.length()/2;

        System.out.println(middleTwo.substring(midTwo -1, midTwo +1));

        Map<String, String>  theTeam = new HashMap<>();

        theTeam.put("Bilal", "is the youngest child");
        theTeam.put("Aliya", "is 6 years old");

        System.out.println(theTeam);
        System.out.println("======================================");

        for (String key : theTeam.keySet()){
            System.out.println(key + " : " + theTeam.get(key));
        }
    }
}