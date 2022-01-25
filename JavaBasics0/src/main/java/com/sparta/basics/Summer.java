package com.sparta.basics;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1, 2, 3, 4, 5};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));
    }
    public int sumArray(int[] bert){
        int result = 0;
        for(int nextValue: bert)
            result += nextValue;
        return result;
    }
}
