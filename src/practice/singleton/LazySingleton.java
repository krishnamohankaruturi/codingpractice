package practice.singleton;

import java.io.Serializable;

public class LazySingleton  extends MyClone implements Serializable {
    private static LazySingleton instance;
    private LazySingleton()
    {
        if(instance != null){
            throw  new IllegalStateException("object cant be create using reflecction");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw  new CloneNotSupportedException();
    }

    protected  Object readResolve(){
        return  instance;
    }



    public  static  synchronized  LazySingleton getInstance(){
        if(instance == null)
        {
            return instance = new LazySingleton();
        }else {
            return  instance;
        }
    }

}
