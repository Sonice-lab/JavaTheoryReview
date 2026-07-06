package sec13;

public class StringExam {
    public static void main(String[] args) {

        // 1. String 사용 (반복문에서 절대 금지!)
        String str = "";
        for(int i = 0; i < 100; i++) {
            str += i; // 100번의 새로운 String 객체가 만들어짐
        }

        // 2. StringBuilder 사용 (권장)
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 100; i++) {
            sb.append(i); // 하나의 객체 안에서 데이터만 추가됨
        }
        String result = sb.toString(); // 마지막에 String으로 변환
        
        System.out.println("결과: " + result);
    }
}
