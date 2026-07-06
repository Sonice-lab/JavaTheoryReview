package sec13;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1. toString 재정의: 주소값 대신 사람이 읽기 좋은 글자로 출력
    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    // 2. equals 재정의: 주소값이 아니라 '이름과 나이'로 비교
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }
}


public class Ex13_01 {
    public static void main(String[] args) {

        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20);

        // Object의 기능을 재정의했으므로, 이제 원하는 대로 작동합니다!
        System.out.println(p1.toString()); // 출력: Person[name=홍길동, age=20]
        System.out.println(p1.equals(p2)); // 출력: true (내용이 같으니까!)
    }
}
