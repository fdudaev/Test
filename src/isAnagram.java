import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String str1, String str2){

        if (str1.length() != str2.length()){
            return false;
        }
        char [] c1 = str1.toLowerCase().toCharArray();
        char [] c2 = str1.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }

}
