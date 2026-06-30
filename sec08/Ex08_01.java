package sec08;

// 1. 부모 클래스
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void cry() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

// 2. 자식 클래스 (상속의 필요성: 부모의 name 변수와 cry 메서드를 그대로 물려받음)
class Dog extends Animal {

    Dog(String name) {
        // 2. super 키워드: 부모 클래스의 생성자를 호출하여 name 초기화
        super(name); 
    }

    // 3. 메서드 오버라이딩: 부모의 cry() 메서드를 자식에 맞게 재정의(덮어쓰기)
    @Override
    void cry() {
        // super.cry(); 만약 부모의 "동물이 소리를 냅니다"도 같이 출력하고 싶다면 이처럼 super 키워드 사용 가능
        System.out.println(name + "가 멍멍 짖습니다!");
    }
}
class Cat extends Animal {

    Cat(String name) {
        // 2. super 키워드: 부모 클래스의 생성자를 호출하여 name 초기화
        super(name); 
    }

    // 3. 메서드 오버라이딩: 부모의 cry() 메서드를 자식에 맞게 재정의(덮어쓰기)
    @Override
    void cry() {
        // super.cry(); 만약 부모의 "동물이 소리를 냅니다"도 같이 출력하고 싶다면 이처럼 super 키워드 사용 가능
        System.out.println(name + "가 야옹합니다!");
    }
}

public class Ex08_01 {


    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이");        
        dog.cry();
        Cat cat = new Cat("야옹이");
        cat.cry();
    }
}
