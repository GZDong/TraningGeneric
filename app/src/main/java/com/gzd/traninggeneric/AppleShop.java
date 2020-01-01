package com.gzd.traninggeneric;

public class AppleShop<T> implements Shop<Apple> { //实现泛型接口，必须指定哪种类型的泛型
    T instanse = new T(); //类型擦除+有些参数没有无参构造方法
    T[] instance = new T[10]; //具体什么类都不知道，无法分配空间
    @Override
    public Apple buy() {
        return null;
    }

    @Override
    public float refund(Apple item) {
        return 0;
    }
}
