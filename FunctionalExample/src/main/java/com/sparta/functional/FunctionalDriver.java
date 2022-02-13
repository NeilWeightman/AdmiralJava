package com.sparta.functional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FunctionalDriver {
    public static void main(String[] args) {
//        String line;
//        List<Author> list = new ArrayList<>();
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader("authors.csv"));
//            br.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                list.add(new Author(values[1], values[2]));
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
        try {
            List<String> l = Files.lines(Path.of("authors.csv"))
                    .skip(1)
                    .map(s -> {
                        String[] values = s.split(",");
                        return new Author(values[1], values[2]);
                    })
                    .filter(a -> a.getLastName().charAt(0) == 'T')
                    .map(a -> a.getFirstName())
                    .toList();
            System.out.println(l);
                    //.forEach(s -> System.out.println(s));;
        } catch (IOException e) {
            e.printStackTrace();
        }
        // can't really change what's in the list
//        for(Author author: list){
//            System.out.println(author);
//            author = new Author("A", "B");
//        }
//        System.out.println(list);

        // can change the contents of the list this way
//        for(int i = 0; i< list.size(); i++) {
//            System.out.println(list.get(i));
//            list.set(i, new Author("Whatever", "Person"));
//        }
//        System.out.println(list);
        // more like the foreach example
//        list.stream()
//                .filter(a -> a.getLastName().charAt(0) == 'T')
//                .map(a -> a.getFirstName())
//                .forEach(s -> System.out.println(s));
    }
}
