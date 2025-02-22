package DesignPatterns;

public class BuilderDI {

    public static void main(String[] args) {
        User user = new User.Userbuilder()
                .age(10).lastName("mohan")
                .fisrtName("ram")
                .email("ram@gmail,com")
                .build();
        System.out.println(user);
    }


}
