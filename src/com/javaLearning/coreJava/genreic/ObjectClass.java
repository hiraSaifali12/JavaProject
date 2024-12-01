package com.javaLearning.coreJava.genreic;

public class ObjectClass<T> {
    T value;
    public T getPrintValue(){
       return value;
    }
    public void setPrintValue(T value1){
        this.value=value1;
    }
}
