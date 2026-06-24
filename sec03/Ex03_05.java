package sec03;

public class Ex03_05 {
    public static void main(String[] args) {
        System.out.println("----------3. 정삼각형 (피라미드)-----------");

         for (int i = 1; i <= 5; i++) { // 총 5줄

            // 1. 공백 찍기 (5 - i 만큼)
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }


            // 2. 별 찍기 (2 * i - 1 만큼)
            for (int k = 1; k <=(2* i-1); k++) {
                System.out.print("*");
         }

         // 3. 줄바꿈
         System.out.println();
    }}

}
