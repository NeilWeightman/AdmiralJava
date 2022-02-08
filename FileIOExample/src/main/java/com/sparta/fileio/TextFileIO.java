package com.sparta.fileio;

import java.io.*;
import java.util.Arrays;

public class TextFileIO {
    public static void readFile(String fileName){
        // try with resources - AutoCloseable
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readWriteFile(String inFile, String outFile){
        // try with resources - AutoCloseable
        try (BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))){
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(Arrays.toString(line.split(",")));
                // write line to new file
                if(line.split(",")[1].equals("Monica"))
                    bw.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
