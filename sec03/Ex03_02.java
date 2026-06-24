package sec03;

public class Ex03_02 {
    public static void main(String[] args) {

        int i = 1; // 1. 초기화를 밖에서 먼저 해줍니다.

        while (i <=5) {
            System.out.println("현재 i의 값: " + i);
            i++;// 2. 증감식을 블록 안쪽에 직접 써주어야 합니다! (매우 중요 ⭐)
        }
        System.out.println("while문 종료!");
    }
}

// 동작 원리: for문과 결과는 완전히 똑같지만, 구조가 다릅니다. 조건(i <= 5)만 괄호 안에 들어가고, 시작 값(int i = 1)과 변화량(i++)은 밖이나 안쪽에 따로 적어주어야 합니다.

// 🚨 주의점: while문 안에서 i++;를 빼먹으면 i가 영원히 1에 머물기 때문에 무한 루프에 빠져 프로그램이 멈추지 않게 됩니다!
