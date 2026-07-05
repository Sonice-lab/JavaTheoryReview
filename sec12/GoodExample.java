package sec12;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class GoodExample {
    
    // ✅ throws 선언: "나는 FileNotFoundException이 발생할 수 있어. 호출한 쪽이 수습해!"
    public void readFile() throws FileNotFoundException { 
        FileReader fr = new FileReader("test.txt"); // 여기서 진짜로 에러가 발생함!
    }

    public static void main(String[] args) {
        
        GoodExample obj = new GoodExample();
        
        try {
            obj.readFile(); // 🚨 여기서 에러가 밖으로 던져지므로(throws), catch가 받아서 수습!
        } catch (FileNotFoundException e) {
            System.out.println("🚨 삐뽀삐뽀: 파일이 존재하지 않습니다. 경로를 확인하세요.");
        }
    }
}
