package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SortByLastName {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("sachin tendulkar", "virat khollikjdgfddfhs", "ms dhoni");
        //list.stream().map(x -> x.split(" ")).map(x -> x[1])
//        list.stream()
//                .sorted((o1,o2) -> o1.substring(o1.indexOf(" ")).length().compareTo(o1.substring(o1.indexOf(" ")).length()))
        list.stream().sorted(Comparator.comparing((String x) -> x.split(" ")[1].length()).reversed()).forEach(x -> System.out.println(x));



    }
}
