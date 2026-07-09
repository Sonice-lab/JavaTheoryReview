package sec16;

// 1. 요리사가 할 작업(대본)을 Runnable 인터페이스로 만듭니다.
class MyTask implements Runnable {
    String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    // ⭐ 스레드가 실행할 실제 작업 내용은 반드시 run() 메서드 안에 적어야 합니다!
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " 진행 중... (" + i + "/5)");
            try {
                // Thread.sleep(밀리초): 0.5초(500ms) 동안 잠깐 대기 (작업 시간을 흉내 냄)
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("✅ " + taskName + " 완료!");
    }
}

public class MultiThreadExam {
    public static void main(String[] args) {
        System.out.println("--- 👩‍🍳 메인 요리사: 청소와 빨래 지시 시작! ---");

        // 2. 작업 대본(Runnable) 생성
        Runnable cleanTask = new MyTask("🤖 로봇청소기");
        Runnable washTask = new MyTask("🧺 세탁기");

        // 3. 실제 일꾼(Thread)을 고용하고 대본을 쥐여줍니다.
        Thread thread1 = new Thread(cleanTask);
        Thread thread2 = new Thread(washTask);

        // 4. ⭐ 작업 시작 지시 (매우 중요!)
        // run()을 직접 호출하면 안 됩니다! 반드시 start()를 호출해야 멀티스레드로 작동합니다.
        thread1.start(); 
        thread2.start();

        System.out.println("--- 👩‍🍳 메인 요리사: 지시 끝! 퇴근합니다! ---");
        // 메인 스레드는 지시만 내리고 먼저 끝나지만, 
        // thread1과 thread2는 여전히 백그라운드에서 남아서 열심히 일합니다.
        
    }
}
