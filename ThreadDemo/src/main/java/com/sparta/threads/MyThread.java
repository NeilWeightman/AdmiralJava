package com.sparta.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MyThread implements Runnable {
    private String name;
    private ArrayList<Author> list;
    private BufferedReader inFile;
    public MyThread(String name, ArrayList<Author> list, BufferedReader inFile){
        this.name = name;
        this.list = list;
        this.inFile = inFile;
    }

    @Override
    public void run() {
        processFile();
    }

    public void processFile(){
        String line;
        try {
                while ((line = inFile.readLine()) != null) {
                    String[] values = line.split(",");
                    synchronized (list) {
                        list.add(new Author(values[1], values[2]));
                    }
                }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
