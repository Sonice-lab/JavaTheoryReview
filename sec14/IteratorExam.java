package sec14;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExam {
    public static void main(String[] args) {
      HashSet<String> nicknames = new HashSet<>();
        nicknames.add("자바왕");
        nicknames.add("코딩초보");
        nicknames.add("파이썬러버");

        // 1. Iterator 지시봉 생성
        Iterator<String> iter = nicknames.iterator();

        System.out.println("--- Iterator 순회 시작 ---");
        
        // 2. hasNext(): "지시봉으로 가리킬 다음 데이터가 남아있니?"
        while (iter.hasNext()) {
            // 3. next(): "다음 데이터를 꺼내줘!"
            String name = iter.next(); 
            System.out.println("꺼낸 데이터: " + name);
            
            // 4. 만약 순회 중에 "코딩초보"를 삭제하고 싶다면 iter.remove() 사용!
            // (향상된 for문에서 remove를 시도하면 에러가 나지만, Iterator는 안전합니다)
            if(name.equals("코딩초보")) { 
                System.out.println("  ↳ '코딩초보'를 주머니에서 삭제합니다!");
                iter.remove(); 
            }
        }
        
        System.out.println("\n--- 삭제 후 남은 데이터 ---");
        for (String name : nicknames) {
            System.out.println(name);
        }
    }
}

