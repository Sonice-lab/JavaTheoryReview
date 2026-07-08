package sec15;

import java.util.HashMap;
import java.util.Set;

public class HashMapExam {
    public static void main(String[] args) {

        // 1. 선언: <키의 타입, 값의 타입> 두 가지 제네릭을 씁니다!
        // 여기서는 키(메뉴이름)는 String, 값(가격)은 Integer로 정했습니다.
        HashMap<String, Integer> cafeMenu = new HashMap<>();

        // 2. 데이터 추가 (put)
        cafeMenu.put("아메리카노", 4500);
        cafeMenu.put("카페라떼", 5000);
        cafeMenu.put("딸기스무디", 6500);

        // 3. 중복 키 입력 시도 (수정으로 작동함!)
        cafeMenu.put("아메리카노", 4000);

         // 4. 데이터 꺼내기 (get)
        System.out.println("라떼 가격: " + cafeMenu.get("카페라떼") + "원");
        // 없는 키를 찾으면 null이 나옵니다.
        System.out.println("녹차 가격: " + cafeMenu.get("녹차") );

        // 5. 키 존재 여부 확인 (containsKey)
        if(cafeMenu.containsKey("딸기스무디")){
            System.out.println("우리 카페는 딸기스무디를 팝니다!");
        }
        // 6. 🔍 HashMap 데이터 순회하기 (keySet 활용)
        // Map은 인덱스가 없기 때문에, Key들만 먼저 싹 모은 다음 for문을 돌려야 합니다.
        System.out.println("\n--- ☕ 카페 메뉴판 전체 출력 ---");

        Set<String> keys = cafeMenu.keySet(); // 키("아메리카노", "카페라떼"...)만 모아서 Set으로 받음

        for(String key : keys){
            Integer price = cafeMenu.get(key); // 키를 이용해 값을 하나씩 꺼냄
            System.out.println(key + ":" + price + "원");
        }
    }
    
}
