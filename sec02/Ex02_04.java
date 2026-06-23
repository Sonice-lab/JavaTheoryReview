package sec02;

public class Ex02_04 {
    public static void main(String[] args) {
        String order = "시그니처 라떼";

        // Switch 표현식: 결과를 바로 price 변수에 담습니다.
        int price = switch (order) {
            case "아메리카노" -> 3000;
            case "카페라떼", "카푸치노" -> 4000; // 쉼표(,)로 여러 조건을 깔끔하게 묶을 수 있습니다.
            case "에이드" -> 4500;

            // [3번 예시 추가됨] 중괄호 {} 와 yield를 사용한 복합 로직 처리
            case "시그니처 라떼" -> {
                System.out.println("시그니처 메뉴는 제조 시간이 조금 더 걸립니다.");
                int basePrice = 5000;
                int toppingPrice = 500;
                yield basePrice + toppingPrice; // 최종 반환값 지정
            }
            default -> {
                System.out.println("죄송합니다. 해당 메뉴는 없습니다.");
                yield 0; // default 처리가 필요하며, 값을 반환할 때는 yield를 씁니다.
            }
            };// switch 표현식이 끝나는 곳이므로 세미콜론(;)이 필요합니다.

            // 최종 가격 출력
            if (price > 0) {
                System.out.println(" 결제하실 금액은 " + price + "원 입니다.");
            }
        }
            }
