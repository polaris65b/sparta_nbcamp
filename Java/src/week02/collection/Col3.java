package week02.collection;

import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while(!(intStack.isEmpty())){
            System.out.println(intStack.pop());
        }

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
