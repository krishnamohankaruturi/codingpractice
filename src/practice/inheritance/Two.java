package practice.inheritance;

public class Two extends One {
    static {
        System.out.println("static block of two");
    }
    public Two(){
        System.out.println("no paramter of Two");
    }
    public void print()
    {
        System.out.println("print method+ tw0");
    }
    public Two(int a){
        System.out.println("Paramter of Two"+a);
    }
    public static void display(){
        System.out.println("static method class Two");
    }
}
