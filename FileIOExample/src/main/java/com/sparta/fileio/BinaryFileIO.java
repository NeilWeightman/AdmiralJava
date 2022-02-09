package com.sparta.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileIO extends TextFileIO {
    public static void readBinary(String inFile){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(inFile);
            int theByte;
            while((theByte = fis.read()) != -1){
                System.out.println(theByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyBinary(String inFile, String outFile){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(inFile);
            fos = new FileOutputStream(outFile);
            int theByte;
            while((theByte = fis.read()) != -1){
                System.out.println(theByte);
                fos.write(theByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
