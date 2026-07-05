package sec12;

public class ThrowExam {

     // 1. throws: "이 메서드는 Exception 폭탄이 터질 수 있으니 부르는 쪽이 수습해라!" (경고장)
    public static void checkAge(int age) throws Exception {
        
        System.out.println("--- 탑승자 나이 검사 시작 ---");
        
        if (age < 0) {
            // 2. throw: 나이가 음수일 수는 없으므로, 내가 직접 폭탄을 만들어서 터뜨림!
            throw new Exception("나이는 0보다 작을 수 없습니다. (입력값: " + age + ")");
        }
        
        System.out.println("검사 통과! 롤러코스터에 탑승하셔도 좋습니다.");
    }



    public static void main(String[] args) {

         // checkAge 메서드가 "나 폭탄 터질 수 있어(throws)"라고 경고했으므로,
        // 이곳에서 반드시 방어복(try-catch)을 입고 호출해야 합니다!
        try {
            checkAge(10);  // 정상 통과
            checkAge(-5);  // 🚨 여기서 throw로 만든 폭탄이 터지고 catch로 넘어감!
            
        } catch (Exception e) {
            // 폭탄이 터졌을 때 수습하는 구조대
            System.out.println("🚨 삐뽀삐뽀: 에러 발생!");
            System.out.println(e.getMessage()); // 내가 만든 에러 메시지가 출력됨
        }
        
    }
}
