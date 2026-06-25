package sec04;

class Calculator {
    // 여기서 (int a, int b)가 바로 매개 변수입니다!
    // "외부에서 정수 2개를 던져주면, 내가 각각 a와 b라는 바구니에 담아서 더해줄게!"

    void add(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 합은: " +  result);
    }
}

public class Ex04_02 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 투입구(매개 변수)에 실제 재료(10, 20)를 던져 넣으며 메서드 실행!
        calc.add(10,20);
    }
}
