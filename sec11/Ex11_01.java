package sec11;


class Outer {
    // 1. 인스턴스 내부 클래스
    class InstanceInner {
        void print() { System.out.println("인스턴스 내부 클래스 실행!"); }

      
    }
}




public class Ex11_01 {
    public static void main(String[] args) {

        // 사용법: 바깥부터 짓고 -> 안을 짓는다.
Outer out = new Outer();
Outer.InstanceInner in = out.new InstanceInner();
in.print(); // 출력: 인스턴스 내부 클래스 실행!


        
    }
}