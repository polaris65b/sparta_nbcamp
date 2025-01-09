package calculator.Level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            if(num2 == 0 && operator == '/'){
                System.out.println("0으로 나눌 수 없습니다. 처음부터 입력하세요.");
                continue;
            }

            int result = calculator.calculate(num1, num2, operator);
            calculator.setResults(result); // Setter메서드를 이용해 저장
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            System.out.println("exit : 종료  | 1. 저장된 결과값 출력 | 2. 가장 먼저 저장된 데이터 삭제 |그외 : 계산 시작");
            String status = "";
            while(!status.equals("exit")){
                status = sc.next();
                if(status.equals("exit")){
                    break;
                }
                if (status.equals("1")) {
                    System.out.println(calculator.getResults());
                } else if (status.equals("2")) {
                    calculator.removeResult();
                }
            }
            if(status.equals("exit")){
                break;
            }
        }
    }
}