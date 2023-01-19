package com.mainPackage;

public class Generics<T>{

    T obj;

    public Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
