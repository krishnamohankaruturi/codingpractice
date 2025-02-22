package multithreading.threadpoolexecutor;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(2, 4, 10,
                        TimeUnit.MINUTES, new ArrayBlockingQueue<>(2),
                        new CustomThreadFactory(), new CustomRejecthandler());
        for (int i = 1; i <= 7; i++) {
            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    //throw new RuntimeException(e);
                }
                System.out.println("task processed by " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejecthandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("task rejected" + r.toString());
    }
}

