package sec07;

class Calculator2{
    // 1. 정수 2개 덧셈
    int add(int a, int b) {
        return a + b;
    }

    // 2. 실수 2개 덧셈 (매개 변수 타입이 다름 -> 오버로딩 성공!)
    double add(double a, double b) {
        return a + b;
    }
    
    // 3. 정수 3개 덧셈 (매개 변수 개수가 다름 -> 오버로딩 성공!)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Ex07_05 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2(); // 외부 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성
        
        // // 1. 정수 2개 덧셈
        // int sum1 = calc.add(10, 20);
        // System.out.println("정수 2개 덧셈: " + sum1);
        
        // // 2. 실수 2개 덧셈
        // double sum2 = calc.add(3.14, 2.71);
        // System.out.println("실수 2개 덧셈: " + sum2);
        
        // // 3. 정수 3개 덧셈
        // int sum3 = calc.add(5, 10, 15);
        // System.out.println("정수 3개 덧셈: " + sum3);

        // 자바가 내가 던져주는 재료(아규먼트)를 보고 알아서 알맞은 add 메서드를 척척 찾아갑니다!
        System.out.println("정수 2개 덧셈: " + calc.add(10, 20)); // 1번 실행
        System.out.println("실수 2개 덧셈: " + calc.add(3.14, 2.71)); // 2번 실행
        System.out.println("정수 3개 덧셈: " + calc.add(10, 20, 30)); // 3번 실행
    }
}
