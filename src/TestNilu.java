import java.util.Arrays;

public class TestNilu {

    public static void main(String[] args) {

        ToStringTest t1 = new ToStringTest("Bilal", 2);
        System.out.println(t1);


        String str = "reverse this string";
        System.out.println(new StringBuilder(str).reverse());
        String toRev = "";
        for(int i = 0; i < str.length(); i++){
            toRev = str.charAt(i) + toRev;
        }

        System.out.println(toRev);

        Calculator calculator = new Calculator(20, 3);
        System.out.println(calculator.subtraction());
        System.out.println(calculator.addition());
        System.out.println(calculator.division());
        System.out.println(calculator.multiplication());


    }

}
