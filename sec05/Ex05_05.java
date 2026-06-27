package sec05;

import java.util.Arrays;
//  숫자가 뒤죽박죽인 배열을 순서대로 예쁘게 정리해 줌
public class Ex05_05 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
Arrays.sort(arr); 

System.out.println(Arrays.toString(arr)); 
// 출력 결과: [1, 2, 5, 8, 9] (자동으로 정렬됨!)
    }
}
