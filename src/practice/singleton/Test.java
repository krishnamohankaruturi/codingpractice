package practice.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        System.out.println("hello world");
        LazySingleton instance1 = LazySingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize singleton object from the file
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        LazySingleton instance2 = (LazySingleton) in.readObject();
        in.close();

        System.out.println("instance1 hashCode: " + instance1.hashCode());
        System.out.println("instance2 hashCode: " + instance2.hashCode());

        LazySingleton reflectionInstance=null;
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        for(Constructor constructor: constructors)
        {
            constructor.setAccessible(true);
            reflectionInstance = (LazySingleton) constructor.newInstance();
        }
        System.out.println(reflectionInstance.hashCode());

        LazySingleton instance3 = (LazySingleton) instance1.clone();
        System.out.println(instance3.hashCode());










    }
}
