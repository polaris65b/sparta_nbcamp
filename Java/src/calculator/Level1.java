package calculator;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String status = "";

        do{
            // num1 입력
            System.out.print("숫자1 : ");
            int num1 = sc.nextInt();

            // 연산 입력
            System.out.print("사칙연산 기호를 입력 : ");
            char operator = sc.next().charAt(0);

             // num2 입력
            int num2 = 0;
            while(true){
                System.out.println("양의 정수2 : ");
                num2 = sc.nextInt();
                if(operator == '/' && num2 == 0){
                    System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
                }else break;
            }

            // 결과
            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    break;
            }
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            System.out.print("종료를 원하면 exit를 입력 :");
            status = sc.next();
        }
        while(!status.equals("exit"));
    }
}