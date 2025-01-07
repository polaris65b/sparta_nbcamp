package week02.arraay;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 1. 배열에 특정값 대입해서 선언
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};


        // 배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArr, 1);

        for(int i:intArr){
            System.out.println(i);
        }
    }
}
