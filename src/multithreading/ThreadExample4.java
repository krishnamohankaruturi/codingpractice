package multithreading;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String  threadname = Thread.currentThread().getName();
            System.out.println(threadname+"lamba run method");
        };
        Thread thread1 = new Thread(runnable,"My thread...1");
        thread1.start();
        Thread thread2 = new Thread(runnable,"My thread...2");
        thread2.start();
    }
}
