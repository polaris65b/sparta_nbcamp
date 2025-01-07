package week03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 초기값 기본 값 확인 : 초기값을 준 것은 그 값이 들어가고, 아닌 값은 default value가 set
        System.out.println("car.model = " + car.model);
        System.out.println("car.color = " + car.color);
        System.out.println();

        System.out.println("car.spped = " + car.speed);
        System.out.println("car.gear = " + car.gear);
        System.out.println("car.lights = " + car.lights);
        System.out.println();

        System.out.println("car.tire = " + car.tire);
        System.out.println("car.door = " + car.door);
        System.out.println();

        // 필드 사용
        car.color = "blue"; // 필드 color에 "blue" 데이터를 저장
        car.speed = 100;
        car.lights = false;

        System.out.println("=============");
        System.out.println("car.color = " + car.color);
        System.out.println("car.spped = " + car.speed);
        System.out.println("car.lights = " + car.lights);
    }
}
