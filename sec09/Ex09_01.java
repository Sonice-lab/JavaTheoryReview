package sec09;

class Animal {void cry() {}}
class Dog extends Animal {void bark() {System.out.println("멍멍");}}
class Cat extends Animal {void meow() {System.out.println("야옹");}}

    // 다형성의 핵심: 매개 변수를 부모(Animal) 타입으로 뚫어두면,
    // 강아지든 고양이든 이 메서드 하나로 다 받을 수 있습니다! (업캐스팅)

public class Ex09_01 {

    public static void checkPet(Animal animal) {

        // 1. 진짜 본체가 강아지인지 확인
        if (animal instanceof Dog) {
            System.out.println("이 동물은 강아지입니다.");
            Dog dog = (Dog) animal; //다운캐스팅
            dog.bark();
        }
        // 2. 진짜 본체가 고양이인지 확인
        else if(animal instanceof Cat) {
            System.out.println("이 동물은 고양이입니다.");
            Cat cat = (Cat) animal; //다운캐스팅
            cat.meow();
        }
        else {
            System.out.println("정체불명의 동물입니다.");
        }
        }
    public static void main(String[] args) {
    Animal pet1 = new Dog(); //업캐스팅
    Animal pet2 = new Cat(); //업캐스팅
    
    checkPet(pet1); //멍멍!
    checkPet(pet2); //야옹!

    }
}

    
