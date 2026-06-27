package sec05;

import java.util.Arrays;

public class Ex05_03 {
     public static void main(String[] args) {
        
    System.out.println("--- 1. 2차원 배열 만들기 ---");
        // 2행(층) 3열(호) 크기의 배열 생성
        int[][] apartment = new int[2][3];
        
        // 0층 데이터 넣기
        apartment[0][0] = 100; // 0층 0호
        apartment[0][1] = 200; // 0층 1호
        apartment[0][2] = 300; // 0층 2호
        
        // 1층 데이터 넣기
        apartment[1][0] = 400; // 1층 0호
        apartment[1][1] = 500; // 1층 1호
        apartment[1][2] = 600; // 1층 2호

        System.out.println("0층 1호의 값은: " + apartment[0][1]); // 200 출력
        

        
        // 캔버스의 이중 for문을 다 지우고, 이 한 줄만 써도 전체 데이터가 괄호 안에 묶여서 출력됩니다!
System.out.println(Arrays.deepToString(apartment)); 
// 출력 결과: [[100, 200, 300], [400, 500, 600]]
// Arrays.deepToString()은 2차원 배열 전체를 괄호로 묶어 한 줄로 출력하기 때문에 줄바꿈이 되지 않음.
       
    }
}
