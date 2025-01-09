package week03.Calculator;

public class DivideOperation extends AbstractOperation{
    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double) firstNumber / secondNumber;
    }
}
