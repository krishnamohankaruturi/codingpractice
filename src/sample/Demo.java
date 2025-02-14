package sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice","barbie", "haha");
        Optional<String> first = names.stream().filter(name -> name.length() > 5).findFirst();
        //System.out.println(first.orElseGet(() -> getDefaultValue()));
        System.out.println(first.orElse(getDefaultValue()));


    }

    public static  String getDefaultValue()
    {
        System.out.println("computing default value");
        return  "defaukkt value";
    }


}
