package sec10;

// 1. 미완성 설계도 (추상 클래스)
abstract class Animal {
    String name; // 일반 변수도 가질 수 있음
    
    void sleep() { // 일반 메서드도 가질 수 있음
        System.out.println("Zzz...");
    }
    
    // ⭐ 핵심: 껍데기만 있는 추상 메서드 (자식에게 구현을 강제함)
    abstract void cry(); 
}

// 2. 부모의 규칙을 잘 따른 착한 자식
class Dog extends Animal {
    // 부모의 추상 메서드 cry()를 반드시 오버라이딩 해야만 에러가 안 납니다!
    @Override
    void cry() {
        System.out.println("멍멍!");
    }
}

// 3. 🚨 부모의 규칙을 어긴 반항아 자식 (에러 발생 실험)
// 아래 주석(//)을 지우면 바로 빨간 밑줄 에러가 뜹니다!
/*
class Pig extends Animal {
    // 부모님이 강제한 cry() 메서드를 만들지 않아서 자바가 화를 냅니다.
    // 에러 메시지: The type Pig must implement the inherited abstract method Animal.cry()
}
*/

public class Ex10_01 {
    public static void main(String[] args) {

        // Animal a = new Animal(); // 🚨 에러! 추상 클래스는 본체를 만들 수 없음
        
        // 다형성 완벽 적용! 부모 리모컨으로 조종
        Animal myDog = new Dog(); 
        
        myDog.sleep(); // 부모가 물려준 일반 기능
        myDog.cry();   // 자식이 강제로 구현한 기능 (멍멍!)
        
    }
}
