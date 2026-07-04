package sec11;

// 1. 규칙만 있는 인터페이스 (대본의 틀)
interface ButtonClickListener {
    void onClick(); 
}

public class Ex11_05 {
    public static void main(String[] args) {

        // 2. 익명 클래스 생성!
        // "ButtonClickListener 규격을 따를 건데, 이름은 굳이 안 지을게. 
        // 대신 뒤에 { }를 바로 열어서 onClick() 기능을 즉석에서 채워줄게!"
        ButtonClickListener btn = new ButtonClickListener() {
            @Override
            public void onClick() {
                // 이 버튼만의 고유한 일회용 기능
                System.out.println("버튼이 클릭되었습니다! 데이터가 저장됩니다."); 
            }
        }; 
        // 🚨 주의: 익명 클래스는 하나의 '명령문'을 끝내는 것이므로 마지막에 세미콜론(;)이 꼭 필요합니다!
        
        // 3. 이벤트 발생 시뮬레이션
        btn.onClick();
        
    }
}
