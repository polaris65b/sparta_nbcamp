package week03.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("firstNumber : ");
        int firstNumber = sc.nextInt();
        System.out.print("secondNumber : ");
        int secondNumber = sc.nextInt();

        System.out.print("연산 : ");
        String operate = sc.next();

        AbstractOperation operation = null;
        switch (operate){
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new Substractoperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                if(secondNumber == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                operation = new DivideOperation();
                break;
            case "%":
                operation = new AbstractOperation() {
                    @Override
                    public double operate(int firstNumber, int secondNumber) {
                        return firstNumber % secondNumber;
                    }
                };
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        Calculator calculator = new Calculator(operation);
        double result = calculator.calculate(firstNumber, secondNumber);

        System.out.println(firstNumber +" "+operate + " " + secondNumber + " = " + result);
    }
}
