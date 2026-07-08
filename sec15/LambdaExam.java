package sec15;

import java.util.HashMap;

public class LambdaExam {
    public static void main(String[] args) {
        HashMap<String, Integer> cafeMenu = new HashMap<>();
        cafeMenu.put("아메리카노", 4500);
        cafeMenu.put("카페라떼", 5000);
        cafeMenu.put("딸기스무디", 6500);

        System.out.println("--- 1. 기존의 방식 (for-each문과 keySet 활용) ---");
        for (String key : cafeMenu.keySet()) {
            Integer price = cafeMenu.get(key);
            System.out.println(key + " : " + price + "원");
        }

        System.out.println("\n--- 2. 람다식을 활용한 방식 (forEach 메서드) ---");
        // Map이 자체적으로 제공하는 forEach 메서드는 키와 값을 동시에 던져줍니다.
        // 우리는 그 (키, 값)을 화살표(->)로 받아서 바로 출력해버리면 끝입니다!
        cafeMenu.forEach((key, price) -> System.out.println(key + " : " + price + "원"));
    }
}
