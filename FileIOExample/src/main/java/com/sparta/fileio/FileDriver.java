package com.sparta.fileio;

public class FileDriver {
    public static void main(String[] args) {
        TextFileIO.readWriteFile("authors.csv", "newFile.csv");
        BinaryFileIO.copyBinary("09fig04.gif", "newImage.gif");
    }
}
