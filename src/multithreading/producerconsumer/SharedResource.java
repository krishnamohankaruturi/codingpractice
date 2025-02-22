package multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;

    }

    public synchronized void produce(int item) throws InterruptedException {
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (sharedBuffer.isEmpty()) {
            System.out.println("buffer is empty, waitng for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed : " + item);
        notify();
        return item;
    }


}
