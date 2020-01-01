package com.gzd.traninggeneric;

import java.util.List;

public interface Shop<T> { //这个T只是个记号，出了这个接口就没有用的
    //类型检查+类型转化
    T buy();

    float refund(T item);

    //每个实例的T可能都不同
    //静态方法和静态变量不能使用泛型，因为是公用的，不关乎对象实例；但是泛型方法可以

    <E> E renew(E item, int price); //泛型方法   在调用的时候，其实是xx.<E> xxx();只是一般E会省略掉

    //泛型和使用多态的形式的区别是，类型检查更精细，外加自动转型
    public <E> void addToList(E item, List<E> list);

    public void addToList2(Object item, List<Object> list);
}
