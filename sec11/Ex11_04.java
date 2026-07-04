package sec11;

// 규칙만 있는 인터페이스
interface ButtonClickListener {
    void onClick();
}

public class Ex11_04 {
    public static void main(String[] args) {

         // 4. 익명 클래스
        // ButtonClickListener는 인터페이스라 원래 new를 할 수 없지만, 
        // 뒤에 { }를 열고 즉석에서 알맹이를 채워주면 이름 없는 일회용 객체가 탄생합니다!
        ButtonClickListener btn = new ButtonClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다! (일회용 기능)");
            }
        };
        
        btn.onClick(); // 출력: 버튼이 클릭되었습니다! (일회용 기능)
        
    }
}
