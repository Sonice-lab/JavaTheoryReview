package sec07;

public class Ex07_03 {
     // int[] 타입, 즉 '정수 배열' 자체를 매개 변수로 받습니다.
    // 배열의 크기가 3개든 100개든 이 메서드 하나로 모두 출력할 수 있습니다!
    void printAllNumbers(int[] numbers) {
        System.out.println("--- 배열 내용 출력 ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + "번째 방: " + numbers[i]);
        }
    }
    public static void main(String[] args) {
        Ex07_03 outer = new Ex07_03(); // 외부 클래스의 인스턴스를 생성
        int[] myArr = {10, 20, 30, 40, 50}; // 정수 배열 생성
        outer.printAllNumbers(myArr); // 배열을 매개 변수로 전달하여 출력
    }
}
