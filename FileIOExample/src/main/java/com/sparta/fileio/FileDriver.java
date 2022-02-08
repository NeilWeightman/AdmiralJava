package com.sparta.fileio;

import java.io.IOException;

public class FileDriver {
    public static void main(String[] args) {
//        TextFileIO.readWriteFile("authors.csv", "newFile.csv");
//        BinaryFileIO.copyBinary("09fig04.gif", "newImage.gif");
        NIOFiles.accessFileUsingNIO("authors.csv");
        try {
            NIOFiles.tryFileOps();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
