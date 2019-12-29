package com.gzd.traninggeneric;

public interface Shop<T> { //这个T只是个记号，出了这个接口就没有用的
    //类型检查+类型转化
    T buy();
    float refund(T item);

    //每个实例的T可能都不同
    //静态方法和静态变量不能使用泛型，因为是公用的，不关乎对象实例
}
