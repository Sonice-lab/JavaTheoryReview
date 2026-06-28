package sec06;

public class Employee {
    // 1. 인스턴스 변수 (객체마다 다름, 개인 소유)
    private String name;

    // 2. static 변수 (모든 객체가 하나를 공유, 클래스 소유)
    // 회사의 총 직원 수를 추적하는 공용 변수입니다.
    public static int totalEmployees = 0; 
    public static String companyName = "구글";

    // 생성자: 직원이 한 명 새로 입사(생성)될 때마다 실행됨
    public Employee(String name) {
        this.name = name;
        totalEmployees++; // 직원이 생성될 때마다 공용 변수인 총 직원 수를 1씩 증가시킴
    }

    // 3. 인스턴스 메서드 (개인 행동)
    public void introduce() {
        // 인스턴스 메서드에서는 static 변수(companyName)를 자유롭게 가져다 쓸 수 있습니다.
        System.out.println("안녕하세요, " + companyName + "의 직원 " + this.name + "입니다.");
    }

    // 4. static 메서드 (공용 기능)
    public static void showCompanyInfo() {
        System.out.println("회사명: " + companyName);
        System.out.println("현재 총 직원 수: " + totalEmployees + "명");
        
        // 🚨 주의: static 메서드 안에서는 this.name 같은 인스턴스 변수를 쓸 수 없습니다!
        // System.out.println("내 이름은 " + this.name); // (에러 발생)
    }
   
    public static void main(String[] args) {
        
        // 1. 객체를 만들기 전에도 static 메서드는 바로 호출 가능합니다! (클래스명.메서드명)
        Employee.showCompanyInfo(); // 총 직원 수: 0명 출력

        // 2. 직원(객체) 2명 생성
        Employee emp1 = new Employee("김개발");
        Employee emp2 = new Employee("이디자인");

        // 3. 각 직원의 개인 행동
        emp1.introduce();
        emp2.introduce();

        // 4. 객체를 2개 만들었으므로, 공유 변수인 totalEmployees가 2로 증가해 있습니다.
        Employee.showCompanyInfo(); // 총 직원 수: 2명 출력
    }
}

