package sec05;

import java.util.Arrays;

public class Ex06_07 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
int[] b = {1, 2, 3};

System.out.println(a == b); // false (주소가 다르니까)
System.out.println(Arrays.equals(a, b)); // true (방 안의 알맹이가 같으니까!)
    }
}
