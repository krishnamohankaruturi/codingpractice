package practice.inheritance;

public class One {
    static {
        System.out.println("static block of One");

    }
    public static void display(){
        System.out.println("static method class One");
    }

    public One(){
        System.out.println("non paramter of One");
    }
    public One(int a){
        System.out.println("paramter of One"+a);

    }
}
