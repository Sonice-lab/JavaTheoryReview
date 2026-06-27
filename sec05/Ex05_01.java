package sec05;

public class Ex05_01 {
    public static void main(String[] args) {
        System.out.println("--- 1. 배열 생성과 주소 확인 ---");
        // 스택에 arr1 생성, 힙에 방 3개짜리 배열 본체 생성 후 연결
        int[] arr1 = new int[3]; 
        
        // arr1 자체를 출력하면 배열의 안의 값이 아니라 '참조 주소(해시코드)'가 나옵니다.
        // 출력 예시: [I@숫자와알파벳 (이것이 바로 리모컨에 적힌 TV의 고유 번호입니다!)
        System.out.println("arr1 변수가 가진 주소값: " + arr1);
        System.out.println("arr1 배열의 첫 번째 방 초기값: " + arr1[0]); // 힙 영역은 0으로 자동 초기화됨

        
        System.out.println("\n--- 2. 리모컨 복사 (메모리 공유 증명) ---");
        // 스택 영역에 arr2라는 새로운 상자를 만들고, arr1이 가진 '주소'만 복사해 줍니다.
        // (주의: 힙 영역의 본체가 2개가 되는 것이 아닙니다! TV는 1대, 리모컨만 2개가 됨)
        int[] arr2 = arr1; 
        
        System.out.println("arr2 변수가 가진 주소값: " + arr2); // arr1과 주소가 완전히 똑같이 나옴!

        // arr2 리모컨을 이용해 0번 방의 값을 99로 바꿉니다.
        arr2[0] = 99; 
        System.out.println("arr2 리모컨으로 값을 99로 변경했습니다.");


        System.out.println("\n--- 3. 결과 확인 (가장 중요한 부분!) ---");
        // 나는 분명 arr2를 통해 값을 바꿨지만, arr1로 열어봐도 값이 99로 바뀌어 있습니다.
        // 왜냐하면 arr1과 arr2는 '같은 힙 메모리(TV 본체)'를 바라보고 있기 때문입니다!
        System.out.println("arr1[0]의 값은?: " + arr1[0]); 


        System.out.println("\n--- 4. 연결 끊기 (Null) ---");
        arr1 = null; // arr1의 리모컨 주소를 지워버림 (스택 상자를 비움)
        System.out.println("arr1을 null로 만들었습니다.");
        
        // 🚨 아래 코드를 실행하면 어떻게 될까요? (주석 // 을 지우고 실행해 보세요!)
        // System.out.println("연결 끊긴 arr1 열어보기: " + arr1[0]); //NullPointerException
    }
}

