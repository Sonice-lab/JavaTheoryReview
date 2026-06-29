package sec07;

// this예시
class Person {
    String name; // 나의 멤버 변수

    // 외부에서 매개 변수로 name이 들어옴
    public Person(String name) { 
        // name = name; 
        // 🚨 이렇게 쓰면 컴퓨터는 둘 다 방금 들어온 매개 변수로 착각해서 값이 저장되지 않습니다.

        this.name = name; 
        // ✅ "내 객체 본체의 name(this.name)에다가, 외부에서 들어온 재료(name)를 넣어라!"
    }
}
// 생성자 체이닝 this() 예시
class Coffee {
    String name;
    int price;

    // 1. 모든 세팅을 다 하는 '메인 생성자'
    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 2. 이름만 받고 가격은 모를 때 부르는 생성자
    public Coffee(String name) {
        // "가격이 안 들어왔네? 가격은 3000원으로 고정해서 메인 생성자에게 넘겨!"
        this(name, 3000); 
    }

    // 3. 아무것도 안 주고 부를 때 (기본 생성자)
    public Coffee() {
        // "아무 말 없으면 기본 메뉴인 아메리카노 1500원짜리로 메인 생성자에게 넘겨!"
        this("아메리카노", 1500); 
    }
}

public class Ex07_06 {
    public static void main(String[] args) {
        // 1. this 예시
        Person p1 = new Person("홍길동");
        System.out.println("p1.name: " + p1.name); // 홍길동

        Person p2 = new Person("김현아");
        System.out.println("p2.name: " + p2.name); // 김현아

        // 2. 생성자 체이닝 this() 예시
        Coffee c1 = new Coffee("카페라떼", 4000);
        System.out.println("c1.name: " + c1.name + ", c1.price: " + c1.price); // 카페라떼, 4000

        Coffee c2 = new Coffee("카푸치노");
        System.out.println("c2.name: " + c2.name + ", c2.price: " + c2.price); // 카푸치노, 3000

        Coffee c3 = new Coffee();
        System.out.println("c3.name: " + c3.name + ", c3.price: " + c3.price); // 아메리카노, 1500
    }
}
