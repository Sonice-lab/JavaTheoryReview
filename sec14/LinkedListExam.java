package sec14;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        // 1. 선언: 기차처럼 연결될 구조 생성
        LinkedList<String> train = new LinkedList<>();

        // 2. 추가 (기차 칸 연결)
        train.add("1호차");
        train.add("2호차");
        train.add("3호차");

        // ⭐ LinkedList의 장점 발휘: 중간에 데이터 끼워 넣기!
        // 인덱스 1 자리에 "새로운 1.5호차"를 삽입.
        // ArrayList였다면 뒤의 데이터들을 다 밀어야 하지만, LinkedList는 연결 고리만 슥 바꿉니다.
        train.add(1, "새로운 1.5호차");
        
        // 3. 확인
        System.out.println("현재 기차 탐 수 " + train.size());
        
        // 🚨 주의: get()을 쓸 수는 있지만, ArrayList보다 속도가 느립니다. (처음부터 찾아가야 함)
        System.out.println("2번째 칸: " + train.get(1));
        
        // 4. 삭제 (연결 고리 끊기)
        train.remove(2);

        System.out.println("\n--- 현재 기차 상태 ---");
        for (String car : train) {
            System.out.println(car);
        }
        
    }
}
