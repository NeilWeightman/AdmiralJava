package com.sparta.generics;

public class ObjectCache<T extends Number> {
    private T theObject;
    public T getTheObject() {
        return theObject;
    }
    public void setTheObject(T theObject) {
        this.theObject = theObject;
    }
    public double asDouble(){
        return theObject.doubleValue();
    }
}
