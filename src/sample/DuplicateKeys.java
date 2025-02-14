package sample;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateKeys {
    public static void main(String[] args) {
        List<Notes> noteList = new ArrayList<>();
        noteList.add(new Notes(4,"biology","11"));
        noteList.add(new Notes(1,"maths","22"));
        noteList.add(new Notes(2,"science","44"));
        noteList.add(new Notes(3,"social","55"));
        noteList.add(new Notes(4,"history","66"));
        noteList.add(new Notes(6,"history","66"));
        noteList.add(new Notes(5,"geographu","33"));


        LinkedHashMap<Integer, String> collect1 = noteList.stream().collect(Collectors.toMap(Notes::getBookNo, Notes::getName, (v1, v2) -> v1, LinkedHashMap::new));
        System.out.println(collect1);


    }

}
