package sec02;

public class Ex02_03 {
    public static void main(String[] args) {
        String order = "카페라떼";
        int price = 0;

        switch (order) {
            case "아메리카노":
                price = 3000;
                System.out.println("아메리카노를 준비합니다.");
                break;
            case "카페라떼":
            case "카푸치노":
                price =4000;
                System.out.println("우유가 들어간 부드러운 커피를 준비합니다.");
                break;
            case "에이드":
                price = 4500;
                System.out.println("상큼한 에이드를 준비합니다.");
                break;      
            default:
                System.out.println("죄송합니다. 해당 메뉴는 없습니다.");
                break;
        }
        if (price > 0) {
            System.out.println("총 결제하실 금액은: " + price + "원 입니다.");
        }
               
        }
    }

