import java.util.Arrays;

public class findTarget {

    public static int [] findTarget (int [] a, int [] b, int target){

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if( a[i] + b[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int [] a = {12, 2, 3, 5, 52, 3, 4, 8};
        int [] b = {2, 32, 13, 5, 12, 23};

        int count = 10;
        while (count > 0){
            count--;
            System.out.println(count);
        }

        int c = a.length -2 ;
        int d = a.length/2;

        System.out.println( c);
        for (int i = 0; i < a.length; i++){
            if (a[i] == 5){
                System.out.println("5 is located at index [" +i+"]");
        }
        }

        int target = 34;

        System.out.println(Arrays.toString(findTarget(a, b, target)));
    }


}
