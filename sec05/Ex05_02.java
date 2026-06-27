package sec05;

public class Ex05_02 {
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
        

        System.out.println("\n--- 2. 중첩 for문으로 모든 방 출력하기 ---");
        // 바깥 for문 (i): '층(행)'을 돌아다닙니다. (0층 -> 1층)
        // apartment.length 는 '층(행)의 개수'인 2를 의미합니다.
        for (int i = 0; i < apartment.length; i++) {
            
            // 안쪽 for문 (j): 그 층에 있는 '호수(열)'를 돌아다닙니다.
            // apartment[i].length 는 '현재 층의 방 개수'인 3을 의미합니다.
            for (int j = 0; j < apartment[i].length; j++) {
                
                System.out.print(apartment[i][j] + "\t"); // 탭(\t)으로 띄워서 가로로 출력
            }
            System.out.println(); // 한 층의 출력이 끝나면 엔터(줄바꿈)
        }
    }
}
