package sec05;

import java.util.Arrays;

public class Ex05_04 {

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
        

       System.out.println("\n--- 2. Arrays.toString()을 활용하여 층별로 출력하기 ---");
        // Arrays.deepToString()은 한 줄로 출력되므로,
        // for문으로 '층(행)'을 하나씩 내려가며 해당 층의 데이터만 Arrays.toString()으로 출력합니다.
        for (int i = 0; i < apartment.length; i++) {
            
            // apartment[i]는 각 층의 방(열)들을 담고 있는 1차원 배열을 의미합니다.
            System.out.println(i + "층: " + Arrays.toString(apartment[i])); 

        }
    }
}
            
    

