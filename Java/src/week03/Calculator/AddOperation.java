package week03.Calculator;

public class AddOperation extends AbstractOperation{
    @Override
    public double operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
