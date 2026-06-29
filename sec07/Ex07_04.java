package sec07;

 class Greeter {
         // String 타입의 name이라는 매개 변수(투입구)를 하나 뚫어두었습니다.
        void sayHello(String name) {
            System.out.println("안녕하세요, " + name + "님!");
        }
    }

    class Calculator {
    // 가로, 세로, 높이 3개의 정수를 받아 부피를 계산합니다.
    int getVolume(int width, int length, int height) {
        return width * length * height;
    }
    
    // 이름(문자열)과 나이(정수)를 섞어서 받을 수도 있습니다.
    void printProfile(String name, int age) {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
    
    }

    class ArrayPrinter {
    // int[] 타입, 즉 '정수 배열' 자체를 매개 변수로 받습니다.
    // 배열의 크기가 3개든 100개든 이 메서드 하나로 모두 출력할 수 있습니다!
    void printAllNumbers(int[] numbers) {
        System.out.println("--- 배열 내용 출력 ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "번째 방: " + numbers[i]);
        }
    }
}

public class Ex07_04 {

    public static void main(String[] args) {
        // 1. 단일 매개 변수 활용
        Greeter greeter = new Greeter();
        greeter.sayHello("김일남"); // "안녕하세요, 김일남님!" 출력
        greeter.sayHello("이이남"); // 재료만 바꿔서 재사용!
        
        System.out.println();
        
        // 2. 다중 매개 변수 활용
        Calculator calc = new Calculator();
        int boxVolume = calc.getVolume(10, 5, 8); // 10, 5, 8을 순서대로 쏙쏙 던져넣음
        System.out.println("상자의 부피: " + boxVolume);
        
        calc.printProfile("홍길동", 25);
        
        System.out.println();
        
        // 3. 배열 매개 변수 활용
        ArrayPrinter printer = new ArrayPrinter();
        
        int[] myScores = {100, 85, 90}; // 3칸짜리 배열 생성
        int[] yourLotto = {7, 14, 21, 35, 42, 45}; // 6칸짜리 배열 생성
        
        // 하나의 메서드에 크기가 다른 두 배열을 던져도 완벽하게 동작합니다!
        printer.printAllNumbers(myScores); 
        printer.printAllNumbers(yourLotto); 
    }
}
