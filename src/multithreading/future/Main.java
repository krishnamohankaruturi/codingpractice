package multithreading.future;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.HOURS,
                    new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> completeFutureObj = CompletableFuture.supplyAsync(() -> {
                try {
                    System.out.println("Threadname of supply async"+Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                }
                return "task completed";
            }, threadPoolExecutor);

            completeFutureObj.thenAccept((String val) -> {
                System.out.println(val+" succesfully");

            });
            completeFutureObj.thenApplyAsync((String val) -> {
                System.out.println("ThreadName of thenApply"+ Thread.currentThread().getName());
                return "And";
            });






        } catch (Exception e) {

        }
    }
}
