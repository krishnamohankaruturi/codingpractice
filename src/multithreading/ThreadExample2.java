package multithreading;

public class ThreadExample2 {
    public static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Runnable thread");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

}
