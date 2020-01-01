package com.gzd.traninggeneric;

import java.util.List;

public interface EaterShop<F extends Food, T extends Eater<F>> extends Shop<T> {

    //java运行时的一个机制——类型擦除：在运行时，所有的定义的<>都会被擦除，泛型的参数会变为Object，有extends修饰的会变为extends的修饰
    //原因：向java1.5以下做兼容，所以擦除成一样的
    //其实泛型类到运行期是不存在的，都会擦除，所以没有XX<YY>.class的东西

    TypeToken<List<String>> list = new TypeToken<List<String>>(){}; //子类，系统没有的类，定义完之后是在编译时期就有了，
    // 所以能通过反射来拿信息，在字节码中有（不过在运行时还是没有了），所以在后面加{}变成子类
}
