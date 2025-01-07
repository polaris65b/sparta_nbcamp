package week03;

public class Car {
    // 필드 영역
    String compangy;    // 자동차 회사
    String model;       // 자동차 모델
    String color;       // 자동차 색
    double price;       // 자동차 가격
    double speed;       // 자동차 속도, km/h
    char gear;          // 기어 상태(P, R, N, D)
    boolean lights;     // 자동차 조명의 상태

    // 생성자 영역
    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야하는지 정의.
    public Car(){
        // logic
        // 기본생성자(아무것도 없는 상태) : 생략이 가능
    }

    // 메서드 영역

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh){
        speed = kmh;
        return speed;
    }

    // breakePedal
    // input : x
    // ouput : speed
    double breakPedal() {
        speed = 0;
        return speed;
    }

    // changGear
    // input : gear(char type)
    // output : gear(char type)
    char changeGear(char type){
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x
    // output : lights(boolean)
    boolean onOffLights (){
        lights = !lights;
        return lights;
    }

    // horn
    // input : x
    // output : x
    void horn(){
        System.out.println("빵빵!");
    }
}