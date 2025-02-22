package DesignPatterns;

public class User {
    private String firstName;
    private  String lastName;
    private int age;
    private String email;

    private User(Userbuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.age = builder.age;

    }

    @Override
    public String toString() {
        return this.email + " "+this.age+" "+ this.firstName+" "+this.lastName;
    }

    public static  class Userbuilder
    {
        private String firstName;
        private  String lastName;
        private int age;
        private String email;


        public Userbuilder fisrtName(String firstName)
        {
            this.firstName = firstName;
            return  this;
        }
        public Userbuilder lastName(String lastName)
        {
            this.lastName = lastName;
            return  this;
        }
        public Userbuilder age(int age)
        {
            this.age = age;
            return  this;
        }
        public Userbuilder email(String email)
        {
            this.email = email;
            return  this;
        }

        public User build(){
            return  new User(this);
        }








    }
}
