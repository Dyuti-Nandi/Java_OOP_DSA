package com.dyuti.CustomArrayList;

import java.util.List;

public class WildCardExample<T extends Number> {

    public void get(List<Number> list){
        //only the number class can be accessible
    }

    public void get2(List<? extends Number> list) {
        //here we can pass number classes and its subclasses too
    }
}
