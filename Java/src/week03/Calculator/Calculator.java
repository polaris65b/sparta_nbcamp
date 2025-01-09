package week03.Calculator;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation){
        this.operation = operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}

//public class Calculator {
//    private AddOperation addOperation = new AddOperation();
//    private Substractoperation substractoperation = new Substractoperation();
//    private MultiplyOperation multiplyOperation = new MultiplyOperation();
//    private DivideOperation divideOperation = new DivideOperation();
//
//    public double calculate(int firstNumber, int secondNumber , String operator) {
//        double result = 0;
//
//        switch (operator) {
//            case "+":
//                result = addOperation.operate(firstNumber, secondNumber);
//                break;
//            case "-":
//                result = substractoperation.operate(firstNumber, secondNumber);
//                break;
//            case "*":
//                result = multiplyOperation.operate(firstNumber, secondNumber);
//                break;
//            case "/":
//                result = divideOperation.operate(firstNumber, secondNumber);
//                break;
//            case "%":
//                result = firstNumber % secondNumber;
//            default:
//                System.out.println("잘못된 연산자입니다.");
//                break;
//        }
//        return result;
//    }
//}