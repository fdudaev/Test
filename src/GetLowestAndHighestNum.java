import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GetLowestAndHighestNum {

    public static int getLowestNum (int [] num){

        int lowest = num[0];

        for (int i : num){
            if (i < lowest){
                lowest = i;
            }
        }
        return lowest;
    }
    public static int getHighestNum ( int [] num){
        int highest = num[0];
        for (int i : num){
            if (i > highest){
                highest = i;
            }
        }
        return highest;
    }

    public static int getHighNum (int [] array){

        int num = array[0];
        for (int i : array){
            if (num < i){
                num = i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> citiesAndZip = new HashMap<>();

        citiesAndZip.put("New York", 10110);
        citiesAndZip.put("New Jersey", 8873 );
        System.out.println(citiesAndZip.get("New York"));
        citiesAndZip.putIfAbsent("Metuchen", 8840);

        for (Map.Entry<String, Integer> i : citiesAndZip.entrySet()){
            System.out.println("City = " + i.getKey() + ", ZipCode = "+i.getValue());
        }



        Random random = new Random();
        int ranNum = random.nextInt(100000000, 999999999);
        System.out.println(ranNum);
        int [] a = {5, 2, 3,4,3, 5};
        System.out.println(getLowestNum(a));
        System.out.println(getHighestNum(a));
        System.out.println(getHighNum(a));

        Map<String, Integer> nameAndNum = new HashMap<>();
        nameAndNum.put("Beckham", 7);
        nameAndNum.put("Bruno", 8);
        nameAndNum.put("Pele", 10);
        nameAndNum.put("Zidane", 10);
        for (Map.Entry<String, Integer> i : nameAndNum.entrySet()){
            System.out.println("Name: " + i.getKey() + "\nNumber: "+i.getValue());
        }




    }

}
