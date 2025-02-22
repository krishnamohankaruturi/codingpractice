package multithreading;

public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonlynoys runnable");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
