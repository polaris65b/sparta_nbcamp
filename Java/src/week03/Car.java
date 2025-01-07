package week03;

public class Car {
    // 필드 영역
    // 1) 고유 데이터 영역
    String compangy;    // 자동차 회사
    String model = "Gv80";       // 자동차 모델
    String color;       // 자동차 색
    double price;       // 자동차 가격

    // 2) 상태 데이터 영역
    double speed;       // 자동차 속도, km/h
    char gear;          // 기어 상태(P, R, N, D)
    boolean lights = true;     // 자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // 생성자 영역
    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야하는지 정의.
    public Car(){
        // logic
        // 기본생성자(아무것도 없는 상태) : 생략이 가능
    }

    // 메서드 영역
    // gasPedal
    // input : kmh      output : speed
    double gasPedal(double kmh, char type){
        changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    // breakePedal
    // input : x        ouput : speed
    double breakPedal() {
        speed = 0;
        return speed;
    }

    // changGear
    // input : gear(char type)      output : gear(char type)
    char changeGear(char type){
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x                    output : lights(boolean)
    boolean onOffLights (){
        lights = !lights;
        return lights;
    }

    // horn
    // input : x                    output : x
    void horn(){
        System.out.println("빵빵!");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speeds){
        for(double v : speeds){
            System.out.println("v = " + v);
        }
    }
}