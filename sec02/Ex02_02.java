package sec02;

public class Ex02_02 {
    public static void main(String[] args) {
        
        int score = 70;
        char grade;

        if (score >= 90) {
            grade = 'A';
            System.out.println("훌륭합니다! 최우수 성적입니다.");
        } else if (score >= 80) {
            grade = 'B';
            System.out.println("좋은 성적입니다. 잘하셨어요.");
        } else if (score >= 70) {
            grade = 'C';
            System.out.println("합격입니다. 조금 더 노력해 보세요.");
        } else {
            grade = 'F';
            System.out.println("불합격입니다. 재수강이 필요합니다.");
        }
        System.out.println( "최종 등급: " + grade);
    }
}
