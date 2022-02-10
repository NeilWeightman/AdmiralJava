package com.sparta.threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ThreadDriver {
    public static void main(String[] args) {
        ArrayList<Author> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("authors.csv"));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyThread t1 = new MyThread("t1", list, br);
        Thread th1 = new Thread(t1);
        MyThread t2 = new MyThread("t2", list, br);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Author a: list){
            System.out.println(a);
        }
        System.out.println(list.size());
    }
}
