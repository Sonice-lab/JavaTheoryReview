package sec02;

public class Ex02_01 {
    public static void main(String[] args) {
        System.out.println();


int age = 25;
boolean hasTicket = false;
// AND (&&) 사용: 나이가 18세 이상 '이고' 티켓이 '있어야' 입장 가능
if (age >= 18 && hasTicket) {
    System.out.println("You are allowed to enter the concert.");
} else {
    System.out.println("You are not allowed to enter the concert.");
}

boolean isWeekend = false;
boolean isHoliday = true;

// OR (||) 사용: 주말 '이거나' 공휴일 '이면' 쉰다
if (isWeekend || isHoliday) {
    System.out.println("Enjoy the weekend!");
} 


    }
}

