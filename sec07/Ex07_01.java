package sec07;



public class Ex07_01 {

    class Greeter {
         // String 타입의 name이라는 매개 변수(투입구)를 하나 뚫어두었습니다.
        void sayHello(String name) {
            System.out.println("안녕하세요, " + name + "님!");
        }
    }
    
    public static void main(String[] args) {
        Ex07_01 outer = new Ex07_01(); // 외부 클래스의 인스턴스를 생성
        Greeter greeter = outer.new Greeter(); // 외부 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성
        greeter.sayHello("홍길동");
        greeter.sayHello("김현아");
    }
}
