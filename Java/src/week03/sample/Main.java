package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // 메서드 호출 : main.getClass()
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
    }

    public int getNumber() {
        int number = 1; // 지역 변수
        number += 1;
        return number; // 메서드 종료되면 지역변수 제거됨
    }
}

// 출력
//main.getNumber() = 2
//main.getNumber() = 2
//main.getNumber() = 2