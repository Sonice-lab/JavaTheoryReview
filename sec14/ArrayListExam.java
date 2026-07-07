package sec14;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 1. 선언: String 타입만 담는 스마트 바구니 생성
        ArrayList<String> list = new ArrayList<>();

        // 2. 추가
        list.add("자바");
        list.add("파이썬");
        list.add("제네릭");

        // 3. 확인
        System.out.println("현재 담긴 개수: " + list.size()); // 3 출력
        System.out.println("2번째 데이터: " + list.get(1)); // "파이썬" 출력


        // 4. 삭제 (중간의 '파이썬'을 삭제하면, '제네릭'이 1번으로 당겨짐!)
        list.remove(1);

        System.out.println("\n---삭제 후 전체 목록---");

        for (String item : list) {
            System.out.println(item);
        }


    }
}
