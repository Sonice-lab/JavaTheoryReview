package sec10;

// 1. 카메라 자격증 (인터페이스)
interface Camera {
    // interface 안에서는 abstract 키워드를 생략해도 자동으로 추상 메서드가 됩니다.
    void takePhoto(); 
}

// 2. 전화기 자격증 (인터페이스)
interface Call {
    void makeCall(String number);
}

// 3. 다중 구현: 스마트폰은 '카메라' 기능과 '전화' 기능을 모두 장착합니다!
class SmartPhone implements Camera, Call {
    
    // Camera 인터페이스의 규칙 이행 (필수)
    @Override
    public void takePhoto() {
        System.out.println("📸 찰칵! 고화질 사진을 찍습니다.");
    }

    // Call 인터페이스의 규칙 이행 (필수)
    @Override
    public void makeCall(String number) {
        System.out.println("📞 " + number + " 번호로 전화를 겁니다.");
    }
    
    // 스마트폰만의 고유 기능
    public void playGame() {
        System.out.println("🎮 모바일 게임을 실행합니다.");
    }
}

public class Ex10_02 {
    public static void main(String[] args) {

           // 1. 본체 생성
        SmartPhone galaxy = new SmartPhone();
        galaxy.makeCall("010-1234-5678");
        galaxy.takePhoto();
        galaxy.playGame();
        
        System.out.println("\n--- 다형성(리모컨 제한) 테스트 ---");

        // 2. Camera 자격증(리모컨)으로만 조종하기
        Camera cam = galaxy; // 업캐스팅
        cam.takePhoto(); 
        // cam.makeCall(); // 🚨 에러! 카메라 리모컨에는 전화 버튼이 없습니다.
        
        // 3. Call 자격증(리모컨)으로만 조종하기
        Call phone = galaxy; // 업캐스팅
        phone.makeCall("112");
        // phone.playGame(); // 🚨 에러! 전화 리모컨에는 게임 버튼이 없습니다.
    }
        
    }
