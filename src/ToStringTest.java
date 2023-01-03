public class ToStringTest {

    String name;
    int age;

    public ToStringTest(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return name + " " + age;
    }

}
