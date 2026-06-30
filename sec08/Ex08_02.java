package sec08;

// 부모 클래스
class Parent {
    // 부모의 변수
    String name = "부모 클래스의 변수";

    // 부모의 메서드
    void showMessage() {
        System.out.println("부모 클래스의 메서드 호출!");
    }
}

// 자식 클래스 (Parent를 상속받음)
class Child extends Parent {
    // 자식 클래스에서 부모와 '동일한 이름'으로 변수를 선언 (상속받은 변수가 가려짐)
    String name = "자식 클래스의 변수";

    // 메서드 오버라이딩 (부모의 메서드를 재정의)
    @Override
    void showMessage() {
        System.out.println("자식 클래스의 메서드 호출!");
    }

    // super를 테스트해볼 메서드
    void test() {
        System.out.println("=== 1. 변수 접근 비교 ===");
        // 그냥 name 또는 this.name은 현재 자식 클래스의 변수를 가리킵니다.
        System.out.println("그냥 name: " + name); 
        // super.name은 부모 클래스로부터 물려받은 원본 변수를 가리킵니다.
        System.out.println("super.name: " + super.name); 

        System.out.println("\n=== 2. 메서드 호출 비교 ===");
        // 현재 자식 클래스에서 오버라이딩된 메서드가 호출됩니다.
        System.out.print("그냥 showMessage() 결과 -> ");
        showMessage(); 
        
        // super.showMessage()는 오버라이딩되기 전, 부모 클래스의 원본 메서드를 호출합니다.
        System.out.print("super.showMessage() 결과 -> ");
        super.showMessage(); 
    }
}

// 실행을 위한 메인 클래스

public class Ex08_02 {
    public static void main(String[] args) {
        Child child = new Child();
        child.test(); // 테스트 메서드 실행
        
    }
}
