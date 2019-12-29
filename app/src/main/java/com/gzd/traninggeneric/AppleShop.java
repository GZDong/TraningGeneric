package com.gzd.traninggeneric;

public class AppleShop implements Shop<Apple> { //实现泛型接口，必须指定哪种类型的泛型
    @Override
    public Apple buy() {
        return null;
    }

    @Override
    public float refund(Apple item) {
        return 0;
    }
}
