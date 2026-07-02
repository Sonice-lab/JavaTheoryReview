package sec10;

// 1. USB-C 포트 같은 규격(인터페이스)을 만듭니다.
interface Laptop {
    void turnOn();
}

// 2. 맥북과 그램 모두 규격(인터페이스)에 맞춰서 제작합니다.
class MacBook implements Laptop {
    public void turnOn() { System.out.println("맥북 켜짐"); }
}
class Gram implements Laptop {
    public void turnOn() { System.out.println("그램 켜짐"); }
}

// 3. 결합도가 낮아진 훌륭한 개발자 클래스
class Developer {
    // 특정 클래스(MacBook)가 아니라, 인터페이스(Laptop)에 의존합니다!
    // 지급받은 노트북을 나중에도 계속 사용하기 위해 클래스 전체에 만들어두는 개인 보관함(멤버 변수)
    Laptop myLaptop; 

    // 외부에서 어떤 노트북이든 던져주면(매개 변수) 받아서 씁니다.
    Developer(Laptop laptop) {
        this.myLaptop = laptop; 
    }

    void work() {
        myLaptop.turnOn(); // 어떤 노트북이든 켜짐 버튼은 무조건 있으니까 안심!
    }
}


public class Ex10_03 {
    public static void main(String[] args) {
        // 상황 1: 맥북을 지급받은 개발자
        Laptop mac = new MacBook();
        Developer dev1 = new Developer(mac);
        dev1.work(); // 출력: 맥북 켜짐

        // 상황 2: 그램으로 노트북이 바뀌어도, Developer 클래스의 코드는 1줄도 수정할 필요가 없습니다!!
        Laptop gram = new Gram();
        Developer dev2 = new Developer(gram);
        dev2.work(); // 출력: 그램 켜짐
        
    }
}
