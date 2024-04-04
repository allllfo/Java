package day02;
/*
* Q. 우리는 상점에서 핸드폰을 구매합니다.
* 쏘니가 삼성 핸드폰(SamsungPhone)을 샀습니다.
* 베컴도 애플 핸드폰을(ApplePhone) 샀습니다.
*
* 쏘니가 핸드폰을 켰습니다."야 내 핸드폰 켜볼게"
* "삐비빅"
*
* 베컴도 핸드폰을 켰습니다.
* "turn on"
* "bbeep"
* */
public class PR01 {
    public static void main(String[] args) {
        Person sonny = new Person("손흥민");
        Person beckham = new Person("베컴");
        SamsungPhone sonnyPhone = new SamsungPhone();
        ApplePhone beckhamPhone = new ApplePhone();

        sonny.buyCellphone(sonnyPhone);
        sonny.turnOnMyPhone("야 내 핸드폰 켜볼게");
        beckham.buyCellphone(beckhamPhone);
        beckham.turnOnMyPhone("turn on");

    }
}



class Phone{

    //핸드폰 켜졌을때 소리나는 메소드
    void turnOn(){
        System.out.println("");
    }
}

class SamsungPhone extends Phone{
    void turnOn(){
        System.out.println("삐리릭");
    }
}

class ApplePhone extends Phone{
    void turnOn(){
        System.out.println("bbeep");
    }
}
class Person{
    private String name;
    Phone phone;

    Person(String name){
        this.name = name;
    }

    void buyCellphone(Phone phone){
        this.phone = phone;
    }
    //핸드폰 켜기
    void turnOnMyPhone(String saying){
        System.out.println(saying);
        phone.turnOn();
    }
}
