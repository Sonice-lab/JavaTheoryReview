package sec11;

class Outer2 {
    // 2. 정적 내부 클래스
    static class StaticInner {
        void print() { System.out.println("정적 내부 클래스 실행!"); }
    }
}

public class Ex11_02 {
    public static void main(String[] args) {
        // 바깥 객체 생성 없이 곧바로 생성 가능!
        Outer2.StaticInner in = new Outer2.StaticInner();
        in.print(); // 출력: 정적 내부 클래스 실행!
    }
}
