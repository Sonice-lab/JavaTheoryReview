package sec12;

import java.io.FileReader;

public class ExceptionExam {
    public static void main(String[] args) {
        
        // ----------------------------------------------------
        // 1. Unchecked Exception (컴파일러가 안 막음, 실행 시 터짐)
        // ----------------------------------------------------
        int[] arr = new int[3];
        // arr[5] = 10; 
        // 🚨 주석을 풀면 컴파일 에러는 안 나지만, 실행(Run)을 누르는 순간 
        // ArrayIndexOutOfBoundsException이 터지며 프로그램이 강제 종료됩니다.


        // ----------------------------------------------------
        // 2. Checked Exception (컴파일러가 엄격하게 막음)
        // ----------------------------------------------------
        //FileReader file = new FileReader("없는파일.txt");
        // 🚨 위 코드를 그냥 쓰면 자바가 곧바로 빨간 줄을 띄웁니다.
        // "파일이 없을 수도 있는데 어떡할래? try-catch로 대비책을 써놔!" 라고 강제합니다.

        // ✅ 올바른 대처법 (try-catch 사용)
        try {
            FileReader file = new FileReader("없는파일.txt");
        } catch (Exception e) {
            System.out.println("파일이 없네요! 다른 파일로 대체합니다.");
        }
        
    }
}


