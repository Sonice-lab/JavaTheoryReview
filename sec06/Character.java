package sec06;

// 1. 부모 클래스: 모든 캐릭터의 공통 특징을 모아둔 '기본 뼈대'
public class Character {
   // 자식 클래스(전사, 마법사)에서는 자유롭게 접근할 수 있도록 protected를 사용합니다.
    protected String name;
    protected int hp;


    // 생성자(Constructor): 함수(메서드)의 이름이 클래스의 이름(Character)과 완전히 똑같고, 앞에 void나 int 같은 반환 타입이 없는 것을 '생성자'라고 부름
    // 객체가 메모리에 처음 만들어질 때 가장 먼저 딱 한 번 자동으로 실행
    // 매개변수 (재료 받기): 괄호 안의 String name과 int hp는 이 캐릭터를 완성하기 위해 외부에서 반드시 전달해 주어야 하는 '초기 재료'
    // "캐릭터를 새로 만들 거면 이름과 기본 체력 값을 정해서 넘겨줘!"라고 요구하는 창구
    public Character(String name, int hp) {
        this.name = name;
        // "방금 밖에서 전달받은 이름 데이터(name)를, 내 캐릭터의 고유한 이름 칸(this.name)에 집어넣어라!"
        this.hp = hp;
    }

    // 모든 캐릭터가 할 수 있는 행동 (다형성을 위한 기본 메서드)
    public void attack() {
        System.out.println(this.name + "이(가) 일반 공격을 합니다.");
    }
public static void main(String[] args) {
        // 1. 전사 객체 생성 (이름: "전사아더", 체력: 100, 힘: 20)
        // 인스턴스화
        // new (공간 확보): 컴퓨터의 메모리(RAM)에 붕어빵(전사 객체)을 올려놓을 수 있는 '실제 빈 공간'을 하나 새롭게 마련
        // Warrior(...) (생성자 호출): 앞서 우리가 질문하고 배웠던 '생성자'가 이 타이밍에 호출
        // 비워져 있던 메모리 공간에 "전사아더", 체력 100, 힘 20이라는 초기 재료들을 쏙쏙 채워 넣어 전사 캐릭터를 완성
        // warrior = (리모컨 연결): 완성된 전사 객체는 메모리 어딘가에 동동 떠 있음. 
        // 우리가 이 객체를 조종(메서드 호출)하려면 연결 고리가 필요한데, 
        // 이 완성된 실체를 warrior라는 이름의 변수(리모컨)에 연결해 줌
        Warrior warrior = new Warrior("전사아더", 100, 20);

        // 2. 마법사 객체 생성 (이름: "마법사멀린", 체력: 80, 마력: 15)
        Mage mage = new Mage("마법사멀린", 80, 15);

        System.out.println("=== 전투 시작 ===");
        
        // 3. 다형성 테스트: 똑같은 attack() 명령을 내렸을 때의 반응 확인
        warrior.attack(); // 전사 클래스에서 덮어쓴(Override) 메서드 실행
        mage.attack();    // 마법사 클래스에서 덮어쓴 메서드 실행 (마나 10 소모)

        // 4. 마법사 마나 부족 테스트 (현재 마나가 5 남은 상태)
        System.out.println("\n=== 마법사 연속 공격 시도 ===");
        mage.attack();    // 마나가 10 미만이므로 공격 실패 메시지가 나와야 함
    }
}




// 2. 자식 클래스: 전사 (Character 클래스의 특징을 그대로 물려받음)
class Warrior extends Character {
    private int strength; // 전사만의 고유 속성 (힘)

    public Warrior(String name, int hp, int strength) {
        super(name, hp); // 부모 클래스의 생성자를 호출하여 이름과 체력을 초기화
        this.strength = strength;
    }

    // 다형성: 부모의 attack() 메서드를 전사에게 맞게 덮어쓰기(Overriding) 합니다.
    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 검을 강하게 휘두릅니다! (피해량: " + (this.strength * 2) + ")");
    }
}

// 3. 자식 클래스: 마법사 (Character 클래스의 특징을 그대로 물려받음)
class Mage extends Character {
    private int mana; // 마법사만의 고유 속성 (마력)

    public Mage(String name, int hp, int mana) {
        super(name, hp);
        this.mana = mana;
    }

    // 다형성: 부모의 attack() 메서드를 마법사에게 맞게 덮어쓰기 합니다.
    @Override
    public void attack() {
        if (this.mana >= 10) {
            System.out.println(this.name + "이(가) 강력한 화염구를 발사합니다!");
            this.mana -= 10; // 공격 시 마나 소모
        } else {
            System.out.println("마나가 부족하여 공격할 수 없습니다.");
        }
    }
}