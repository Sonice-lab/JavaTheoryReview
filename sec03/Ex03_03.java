package sec03;

public class Ex03_03 {
    public static void main(String[] args) {
        
        System.out.println("----------1. 직각 삼각형----------");

        // 바깥 루프: 1줄부터 5줄까지 총 5번 반복
        for(int i = 1;i <= 5; i++) {

            // 안쪽 루프: 현재 줄 번호(i)만큼 별을 가로로 찍음
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 안쪽 루프가 끝나면 한 줄이 완성된 것이므로 엔터(줄바꿈)를 쳐줌
            System.out.println();
        }
    }
}
