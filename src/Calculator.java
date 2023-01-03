public class Calculator <T> {

    private int firstOperand;
    private int secondOperand;
    private T operator;

    public Calculator (int firstOperand, int secondOperand){
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;

    }
    public float addition(){
        float sum = firstOperand + secondOperand;
        return sum;
    }
    public float subtraction(){
        float sum = firstOperand - secondOperand;
        return sum;
    }
    public float multiplication (){
        float sum = firstOperand * secondOperand;
        return sum;
    }
    public float division () {
        float sum = firstOperand / secondOperand;
        return sum;
    }


}
