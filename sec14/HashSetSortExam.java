package sec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSortExam {
    public static void main(String[] args) {
    // 0. 기존 HashSet 준비
        HashSet<String> nicknames = new HashSet<>();
        nicknames.add("파이썬러버");
        nicknames.add("자바왕");
        nicknames.add("코딩초보");

        System.out.println("정렬 전 (순서 섞임): " + nicknames);

        // 1. HashSet의 내용물을 ArrayList라는 새 바구니로 통째로 옮겨 담습니다.
        List<String> sortedList = new ArrayList<>(nicknames);

        // 2. Collections.sort() 유틸리티를 사용해 리스트를 가나다(알파벳) 순으로 정렬합니다.
        Collections.sort(sortedList);

        // 3. 정렬된 결과 확인
        System.out.println("\n--- 가나다순 정렬 결과 ---");
        for (String name : sortedList) {
            System.out.println(name);
        }
    }
}
