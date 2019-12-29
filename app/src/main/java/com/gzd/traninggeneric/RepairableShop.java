package com.gzd.traninggeneric;

public interface RepairableShop<E> extends Shop<E> { //扩展泛型接口，必须同样也是泛型的，给父类的类型就是自己的类型
    void repair(E item);
}
