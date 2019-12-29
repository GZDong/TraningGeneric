package com.gzd.traninggeneric;

import java.util.Arrays;

public class MyList<T> {
    private T[] instance;

    public T get(int index) {
        return instance[index];
    }

    public void add(T newItem) {
        instance = Arrays.copyOf(instance, instance.length + 1);
        instance[instance.length - 1] = newItem;
    }

    public T[] getInstance() {
        return instance;
    }

    public void setInstance(T[] instance) {
        this.instance = instance;
    }
}
