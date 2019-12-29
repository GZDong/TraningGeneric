package com.gzd.traninggeneric;

public interface SimShop<T, C extends Sim> extends Shop<T> { //extends 应是个什么，上限
    C getSim(String name, String id);
}
