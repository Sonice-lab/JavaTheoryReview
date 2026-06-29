package sec07;

public class Ex07_02 { 

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
    public static void main(String[] args) {
        Ex07_02 outer = new Ex07_02(); // 외부 클래스의 인스턴스를 생성
        Calculator calculator = outer.new Calculator(); // 외부 클래스의 인스턴스를 통해 내부 클래스의 인스턴스를 생성
        
        // 부피 계산
        int volume1 = calculator.getVolume(3, 4, 5);
        int volume2 = calculator.getVolume(2, 3, 4);
        System.out.println("부피: " + volume1);
        System.out.println("부피: " + volume2);
        
        // 프로필 출력
        calculator.printProfile("홍길동", 30);
        calculator.printProfile("김현아", 25);
    }
    }
