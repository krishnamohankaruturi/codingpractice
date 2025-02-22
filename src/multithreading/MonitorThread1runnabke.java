package multithreading;

public class MonitorThread1runnabke implements  Runnable{

    MonitorLockExample obj;
    MonitorThread1runnabke(MonitorLockExample obj)
    {
        this.obj=obj;
    }
    @Override
    public void run() {
        obj.task1();

    }
}
