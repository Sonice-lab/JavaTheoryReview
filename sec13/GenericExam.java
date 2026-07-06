package sec13;

// T라는 타입이 들어올 공간을 마련한 클래스
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericExam {
    public static void main(String[] args) {
        // String만 담는 상자
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics!");
        String s = stringBox.getItem(); 
        System.out.println("String 출력: " + s);

        // Integer만 담는 상자
        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        int i = intBox.getItem(); 
        System.out.println("Integer 출력: " + i);
    }
}
        
        // 🚨 intBox.setItem("Test"); -> 이렇게 하면 컴파일 단계에서 즉시 에러 발생!
    
  