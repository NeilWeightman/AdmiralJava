package com.sparta.fileio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOFiles {
    public static void accessFileUsingNIO(String fileName){
        try {
            Files.lines(Path.of(fileName)).forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void tryFileOps() throws IOException {
        File f = new File("sort-manager.txt");
        if(f.exists())
            System.out.println("The file exists");
        System.out.println(Files.exists(Path.of("sort-manager.txt")));
        File f2 = new File("test.txt");
        if(!f2.exists()){
            boolean success = f2.createNewFile();
            System.out.println(success);
        }
        File dir = new File("my-new-dir");
        dir.mkdir();
    }
}
