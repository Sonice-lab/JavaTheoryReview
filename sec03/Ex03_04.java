package sec03;

public class Ex03_04 {
    public static void main(String[] args) {
        
        System.out.println("----------2. 역삼각형----------");

        for ( int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
