package sec05;

import java.util.Arrays;

public class Ex05_06 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};

// original 배열을 크기가 5인 새로운 배열로 복사해 줘! (남는 방은 0으로 채워짐)
int[] copied = Arrays.copyOf(original, 5); 

System.out.println(Arrays.toString(copied)); 
// 출력 결과: [1, 2, 3, 0, 0]
    }
}
