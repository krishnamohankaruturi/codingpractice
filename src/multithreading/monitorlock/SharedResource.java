package multithreading.monitorlock;

public class SharedResource {
    boolean itemAvailable = false;
    public  synchronized  void  addItem()
    {
        itemAvailable = true;
        System.out.println("Item added");
        notifyAll();
    }

    public  synchronized  void  consumeItem()
    {
        System.out.println("consume method invoked");
        while (!itemAvailable)
        {
            try {
                System.out.println("thread is waiting");
                wait();
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
            }


        }
        System.out.println("Item consumed");
        itemAvailable=false;
    }
}
