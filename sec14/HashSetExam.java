package sec14;

import java.util.HashSet;

public class HashSetExam {  
    public static void main(String[] args) {
          // 1. 선언: 문자열을 담는 주머니 생성
        HashSet<String> nicknames = new HashSet<>();

        // 2. 데이터 추가
        nicknames.add("자바왕");
        nicknames.add("코딩초보");
        nicknames.add("자바왕"); // 🚨 중복 데이터 추가 시도!
        nicknames.add("파이썬러버");

        // 3. 크기 확인
        // "자바왕"을 두 번 넣었지만, 중복이 무시되어 총 3개만 들어있습니다.
        System.out.println("현재 닉네임 개수: " + nicknames.size()); 

        // 4. 데이터 포함 여부 확인 (빠른 검색)
        if (nicknames.contains("코딩초보")) {
            System.out.println("코딩초보님이 존재합니다!");
        }

        // 5. 전체 데이터 출력 (인덱스가 없으므로 for-each문 사용)
        System.out.println("\n--- 전체 닉네임 목록 ---");
        for (String name : nicknames) {
            System.out.println(name);
            // 출력 결과를 보면 우리가 넣은 순서와 다르게 섞여서 나올 수 있습니다!
        }
    }
}
    
