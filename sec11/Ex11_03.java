package sec11;

class Outer3 {
    void doSomething() {
        // 3. 지역 클래스 (메서드 안에서 생성)
        class LocalInner {
            void print() { System.out.println("지역 클래스 실행!"); }
        }

        // ⭐ 핵심: 지역 클래스는 자신이 태어난 메서드 안에서만 쓸 수 있습니다!
        // 그래서 바로 여기서 생성하고, 기능을 실행해버립니다.
        LocalInner local = new LocalInner();
        local.print();
    } // <- doSomething()이 끝나는 이 순간, LocalInner 텐트도 완전히 철거됩니다.
}

public class Ex11_03 {
    public static void main(String[] args) {
// 그럼 main 메서드에서는 지역 클래스를 어떻게 실행시킬까요?
        // 1. 바깥 껍데기인 Outer 객체를 먼저 만듭니다.
        Outer3 out = new Outer3();
        
        // 2. 지역 클래스가 들어있는 'doSomething()' 메서드를 호출합니다!
        // 이 메서드가 실행되면서, 내부적으로 텐트를 치고 기능을 수행한 뒤 스스로 철거합니다.
        out.doSomething();
    }
}
