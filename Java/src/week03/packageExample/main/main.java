package week03.packageExample.main;

public class main {
    public static void main(String[] args) {
        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.

        week03.packageExample.pk1.Car car1 = new week03.packageExample.pk1.Car();
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
    }
}
