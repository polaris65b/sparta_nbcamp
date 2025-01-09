package calculator.Level2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private Queue<Integer> results;

    public Calculator(){
        this.results = new LinkedList<>();
    }

    public int calculate(int num1, int num2, char operator) {
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
        return result;
    }

    // 결과값 저장
    public void setResults(int result){
        results.add(result);
    }

    // 연산 결과 리스트를 반환하는 메서드
    public Queue<Integer> getResults(){
        return results;
    }

    // 가장 먼저 들어온 결과값 삭제
    public void removeResult(){
        results.poll();
    }
}