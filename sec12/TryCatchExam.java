package sec12;

import java.util.Scanner;

public class TryCatchExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("--- 🧪 위험한 나눗셈 실험 시작 ---");
        
        try {
            // 1. 에러가 날 수 있는 위험한 코드
            System.out.print("10을 나눌 숫자를 입력하세요: ");
            int num = scanner.nextInt(); // 만약 사용자가 '0'을 입력한다면?!
            // nextInt()는 "사용자가 입력한 값 중에서 다음번 숫자(정수)를 쏙 뽑아서 나한테 줘!"라고 스캐너(Scanner)에게 시키는 명령
            
            int result = 10 / num; // 🚨 0으로 나누는 순간 여기서 폭발! (아래 코드는 무시됨)
            
            System.out.println("나눗셈 결과: " + result); 
            System.out.println("실험 대성공!"); // 0이 아닌 숫자를 넣었을 때만 실행됨
            
        } catch (ArithmeticException e) {
            // 2. 0으로 나누는 에러(ArithmeticException)가 터졌을 때 출동하는 구조대
            System.out.println("🚨 삐뽀삐뽀: 숫자를 0으로 나눌 수 없습니다!");
            System.out.println("에러 상세 내용: " + e.getMessage()); // 플랜 B 가동
            
        } finally {
            // 3. 에러가 났든 안 났든 무조건 실행되는 뒷정리 구역
            System.out.println("🧹 실험실 뒷정리를 시작합니다.");
            scanner.close(); // 켜두었던 스캐너 전원을 끕니다.
            System.out.println("--- 🚪 실험 종료 ---");
        }
        
        // try-catch 덕분에 프로그램이 뻗지 않고 아래 코드까지 무사히 도달합니다!
        System.out.println("프로그램이 강제 종료되지 않고 무사히 끝났습니다. 휴~");
    }
}