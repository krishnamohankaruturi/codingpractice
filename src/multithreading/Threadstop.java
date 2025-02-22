package multithreading;

public class Threadstop {
   public  static  class MyRunnable implements  Runnable
   {
       private  boolean stopRequest = false;
       public synchronized void  requestStop()
       {
             this.stopRequest=true;
       }
       public synchronized  boolean isStoprequested()
       {
           return  this.stopRequest;
       }
       private  void  sleep(long millis)
       {
           try {
               Thread.sleep(millis);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       @Override
       public void run() {
           System.out.println("stoppable runnable running");
           while (!isStoprequested())
           {
               sleep(1000);
               System.out.println("...");
           }
           System.out.println("stoppablerunnable stoped");

       }

       public static void main(String[] args) {
           MyRunnable myRunnable = new MyRunnable();
           Thread thread = new Thread(myRunnable,"the thread");
           thread.start();
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("requesting stop");
           myRunnable.requestStop();
           System.out.println("stop requested");
       }
   }
}
