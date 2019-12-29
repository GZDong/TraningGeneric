package com.gzd.traninggeneric;

import java.util.List;

public class Apple implements Fruit{
    @Override
    public float weight() {
        return 0;
    }

    public void addMeToList(List<? super Apple> list) {
        list.add(this);
        Apple apple = list.get(0);
    }
}
